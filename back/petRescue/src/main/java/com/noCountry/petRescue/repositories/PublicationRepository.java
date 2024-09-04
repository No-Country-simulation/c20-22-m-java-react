package com.noCountry.petRescue.repositories;

import com.noCountry.petRescue.entities.Publication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends MongoRepository<Publication, Long>{

}
