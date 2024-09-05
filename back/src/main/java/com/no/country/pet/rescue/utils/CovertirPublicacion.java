package com.no.country.pet.rescue.utils;

import com.no.country.pet.rescue.dtos.PublicacionDTO;
import com.no.country.pet.rescue.entities.Publicacion;

public class CovertirPublicacion {

    public static PublicacionDTO publicacionToPublicacionDTO(Publicacion publicacion) {
        return new PublicacionDTO(
                publicacion.getUsuarioNombre(),
                publicacion.getUsuarioEmail(),
                publicacion.getUsuarioTelefono(),
                publicacion.getmascota_nombre(),
                publicacion.getmascota_especie(),
                publicacion.getmascota_raza(),
                publicacion.getmascota_colores(),
                publicacion.getMascotaTamanio(),
                publicacion.getmascota_edad(),
                publicacion.getMascotaDescripcion(),
                publicacion.getFecha(),
                publicacion.getZona(),
                publicacion.getFotos(),
                publicacion.getPublicaDuenio(),
                publicacion.getRescatada()
        );
    }

    public static Publicacion publicacionDTOToPublicacion(PublicacionDTO publicacion) {
        return new Publicacion(
                publicacion.usuarioNombre(),
                publicacion.usuarioEmail(),
                publicacion.usuarioTelefono(),
                publicacion.mascota_nombre(),
                publicacion.mascota_especie(),
                publicacion.mascota_raza(),
                publicacion.mascota_colores(),
                publicacion.mascotaTamanio(),
                publicacion.mascota_edad(),
                publicacion.mascotaDescripcion(),
                publicacion.fecha(),
                publicacion.zona(),
                publicacion.fotos(),
                publicacion.publicaDuenio(),
                publicacion.rescatada()
        );
    }
}
