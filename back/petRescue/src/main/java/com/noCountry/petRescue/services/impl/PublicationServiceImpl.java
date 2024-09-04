package com.noCountry.petRescue.services.impl;

import com.noCountry.petRescue.dtos.PublicationDTO;
import com.noCountry.petRescue.entities.Publication;
import com.noCountry.petRescue.repositories.PublicationRepository;
import com.noCountry.petRescue.services.IPublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicationServiceImpl implements IPublicationService {

    @Autowired
    private PublicationRepository publicationRepository;
    @Autowired
    private SequenceGeneratorServiceImpl sequenceGeneratorService;

    public PublicationServiceImpl(PublicationRepository publicationRepository, SequenceGeneratorServiceImpl sequenceGeneratorService) {
        this.publicationRepository = publicationRepository;
        this.sequenceGeneratorService = sequenceGeneratorService;
    }

    @Override
    public PublicationDTO create(PublicationDTO publication) {

        Publication publicationToSave = Publication.publicationDTOToPublication(publication);
        publicationToSave.setId(sequenceGeneratorService.getSequenceNumber(Publication.SEQUENCE_NAME));

        publicationRepository.save(publicationToSave);
        return publication;
    }

}
