package com.no.country.pet.rescue.services;
import com.no.country.pet.rescue.dtos.PublicacionDTO;
import com.no.country.pet.rescue.entities.Publicacion;
import java.util.List;

public interface IPublicacionService {
    PublicacionDTO save(PublicacionDTO publicacion);
    List<PublicacionDTO> obtenerTodo();
    PublicacionDTO buscarPorId(String idPublicacion);
    String borrarPorId(String idPublicacion);
}