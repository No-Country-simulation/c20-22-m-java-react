package com.no.country.pet.rescue.controllers;

import com.no.country.pet.rescue.dtos.PublicacionDTO;
import com.no.country.pet.rescue.services.IPublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/publications")
public class PublicacionController {
    
    @Autowired
    IPublicacionService publicacionService;
   
    @PostMapping("/save")
    public ResponseEntity<PublicacionDTO> save(@RequestBody PublicacionDTO publicacion){
        return new ResponseEntity<>(publicacionService.save(publicacion), HttpStatus.OK);
    }
}
