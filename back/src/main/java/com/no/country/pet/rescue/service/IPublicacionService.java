package com.no.country.pet.rescue.service;
import com.no.country.pet.rescue.entity.Publicacion;
import java.util.List;

public interface IPublicacionService {
    String guardar(Publicacion publicacion);
    List<Publicacion> obtenerTodo();
    Publicacion buscarPorId(String idPublicacion);
    String borrarPorId(String idPublicacion);
}