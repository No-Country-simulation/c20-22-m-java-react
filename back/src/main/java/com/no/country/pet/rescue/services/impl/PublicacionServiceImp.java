package com.no.country.pet.rescue.services.impl;

import com.no.country.pet.rescue.dtos.PublicacionDTO;
import com.no.country.pet.rescue.entities.Publicacion;
import com.no.country.pet.rescue.repositories.PublicacionRepository;
import com.no.country.pet.rescue.services.IPublicacionService;
import com.no.country.pet.rescue.utils.CovertirPublicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacionServiceImp implements IPublicacionService {

    @Autowired
    private PublicacionRepository publicacionRepository;

    @Override
    public PublicacionDTO save(PublicacionDTO publicacion) {

        Publicacion publicacionToSave = CovertirPublicacion.publicacionDTOToPublicacion(publicacion);

        publicacionRepository.save(publicacionToSave);

        return publicacion;
    }

    @Override
    public List<PublicacionDTO> obtenerTodo() {
        return null;
    }

    @Override
    public PublicacionDTO buscarPorId(String idPublicacion) {
        return null;
    }

    @Override
    public String borrarPorId(String idPublicacion) {
        publicacionRepository.deleteById(idPublicacion);
        return "User id: "+idPublicacion+" deleted";
    }
}
