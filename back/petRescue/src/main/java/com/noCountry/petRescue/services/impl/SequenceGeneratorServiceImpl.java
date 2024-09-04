package com.noCountry.petRescue.services.impl;

import com.noCountry.petRescue.entities.DbSequence;
import com.noCountry.petRescue.services.ISequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoExpression;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.Objects;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;

@Service
public class SequenceGeneratorServiceImpl implements ISequenceGeneratorService {

    @Autowired
    private MongoOperations mongoOperations;

    public SequenceGeneratorServiceImpl(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    @Override
    public Long getSequenceNumber(String sequenceName) {
        Query query = new Query(Criteria.expr(MongoExpression.create("id")).is(sequenceName));
        Update update = new Update().inc("seq",1);
        DbSequence counter = mongoOperations
                .findAndModify(query,
                        update, FindAndModifyOptions.options().returnNew(true).upsert(true),
                        DbSequence.class);

        return !Objects.isNull(counter) ? counter.getSeq() : 1;
    }
}
