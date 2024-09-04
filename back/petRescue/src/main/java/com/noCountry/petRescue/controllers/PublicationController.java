package com.noCountry.petRescue.controllers;

import com.noCountry.petRescue.dtos.PublicationDTO;
import com.noCountry.petRescue.services.impl.PublicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/publications")
public class PublicationController {

    @Autowired
    private PublicationServiceImpl publicationService;

    public PublicationController(PublicationServiceImpl publicationService) {
        this.publicationService = publicationService;
    }

    @PostMapping("/create")
    public PublicationDTO create(@RequestBody PublicationDTO publicationDTO) {
        return publicationService.create(publicationDTO);
    }
}
