package com.no.country.pet.rescue.controllers;

import com.no.country.pet.rescue.dtos.PublicacionDTO;
import com.no.country.pet.rescue.services.IPublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/publications")
public class PublicacionController {
    
    @Autowired
    IPublicacionService publicacionService;

    @PostMapping("/save")
    public ResponseEntity<PublicacionDTO> save(@RequestBody PublicacionDTO publicacion){
        return new ResponseEntity<>(publicacionService.save(publicacion), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<PublicacionDTO>> all(){
        return new ResponseEntity<>(publicacionService.obtenerTodo(), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<PublicacionDTO> delete(@PathVariable String id, @RequestBody PublicacionDTO publicacion){
        return new ResponseEntity<>(publicacionService.update(id,publicacion), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable String id){
        return new ResponseEntity<>(publicacionService.deleteById(id), HttpStatus.OK);
    }
}
