package com.no.country.pet.rescue.service;

import com.no.country.pet.rescue.entity.Publicacion;
import com.no.country.pet.rescue.repository.PublicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacionServiceImp implements IPublicacionService{

    @Autowired
    private PublicacionRepository publicacionRepo;

    @Override
    public String guardar(Publicacion publicacion) {
        publicacion = publicacionRepo.save(publicacion);
        return ("Publicacion id: "+publicacion.get_id()+" se guardo correctamente.");
    }

    @Override
    public List<Publicacion> obtenerTodo() {
        return publicacionRepo.findAll();
    }

    @Override
    public Publicacion buscarPorId(String idPublicacion) {
        return publicacionRepo.findById(idPublicacion).get();
    }

    @Override
    public String borrarPorId(String idPublicacion) {
        publicacionRepo.deleteById(idPublicacion);
        return "User id: "+idPublicacion+" deleted";
    }
}
