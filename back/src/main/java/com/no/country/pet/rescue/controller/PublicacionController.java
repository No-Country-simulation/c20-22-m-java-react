package com.no.country.pet.rescue.controller;

import com.no.country.pet.rescue.entity.Publicacion;
import com.no.country.pet.rescue.service.IPublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/publicacion")
public class PublicacionController {
    
    @Autowired
    IPublicacionService publicacionService;
   
    @PostMapping("/guardar")
    public ResponseEntity<String> guardar(@RequestBody Publicacion publicacion){
        return new ResponseEntity<>(publicacionService.guardar(publicacion), HttpStatus.OK);
    }
}
