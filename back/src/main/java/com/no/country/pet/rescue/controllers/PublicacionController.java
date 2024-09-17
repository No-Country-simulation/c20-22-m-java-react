package com.no.country.pet.rescue.controllers;
import com.no.country.pet.rescue.dtos.DetailsToUpdateDTO;
import com.no.country.pet.rescue.dtos.PublicacionDTO;
import com.no.country.pet.rescue.services.IPublicacionService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/publications")
public class PublicacionController {

    private static final Logger logger = LoggerFactory.getLogger(PublicacionController.class);

    @Autowired
    IPublicacionService publicacionService;

    @PostMapping("/save")
    public ResponseEntity<PublicacionDTO> save(@Valid @RequestBody PublicacionDTO publicacion) {
        return new ResponseEntity<>(publicacionService.save(publicacion), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<PublicacionDTO>> all() {
        return new ResponseEntity<>(publicacionService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<PublicacionDTO> findById(@PathVariable String id) {
        return new ResponseEntity<>(publicacionService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<PublicacionDTO> update(@PathVariable String id, @RequestBody DetailsToUpdateDTO publicacion) {
        logger.info("Publicacion con id: {} actualizada exitosamente.", id);
        return new ResponseEntity<>(publicacionService.update(id,publicacion), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        logger.info("Publicacion con id: {} eliminada exitosamente.", id);
        return new ResponseEntity<>(publicacionService.deleteById(id), HttpStatus.OK);
    }

    @GetMapping("/allOwnerPublishes")
    public ResponseEntity<List<PublicacionDTO>> allOwnerPublishes() {
        return new ResponseEntity<>(publicacionService.getAllOwnerPublishes(), HttpStatus.OK);
    }

    @GetMapping("/allOwnerNonPublishes")
    public ResponseEntity<List<PublicacionDTO>> allOwnerNonPublishes() {
        return new ResponseEntity<>(publicacionService.getAllOwnerNonPublishes(), HttpStatus.OK);
    }

    @GetMapping("/allRescuedPets")
    public ResponseEntity<List<PublicacionDTO>> allRescuedPets() {
        return new ResponseEntity<>(publicacionService.getAllRescuedPets(), HttpStatus.OK);
    }
}
