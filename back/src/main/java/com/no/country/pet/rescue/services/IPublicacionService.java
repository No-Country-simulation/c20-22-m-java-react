package com.no.country.pet.rescue.services;
import com.no.country.pet.rescue.dtos.PublicacionDTO;
import java.util.List;

public interface IPublicacionService {
    PublicacionDTO save(PublicacionDTO publicacion);
    List<PublicacionDTO> obtenerTodo();
    PublicacionDTO findById(String idPublicacion);
    PublicacionDTO update(String idPublicacion, PublicacionDTO publicacionDTO);
    String deleteById(String idPublicacion);
}