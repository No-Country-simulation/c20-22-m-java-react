package com.no.country.pet.rescue.utils;

import com.no.country.pet.rescue.dtos.PublicacionDTO;
import com.no.country.pet.rescue.entities.Publicacion;

public class CovertirPublicacion {

    public static PublicacionDTO publicacionToPublicacionDTO(Publicacion publicacion) {
        return new PublicacionDTO(
                publicacion.getUsuarioNombre(),
                publicacion.getUsuarioEmail(),
                publicacion.getUsuarioTelefono(),
                publicacion.getMascotaNombre(),
                publicacion.getMascotaEspecie(),
                publicacion.getMascotaRaza(),
                publicacion.getMascotaColores(),
                publicacion.getMascotaTamanio(),
                publicacion.getMascotaEdad(),
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
                publicacion.mascotaNombre(),
                publicacion.mascotaEspecie(),
                publicacion.mascotaRaza(),
                publicacion.mascotaColores(),
                publicacion.mascotaTamanio(),
                publicacion.mascotaEdad(),
                publicacion.mascotaDescripcion(),
                publicacion.fecha(),
                publicacion.zona(),
                publicacion.fotos(),
                publicacion.publicaDuenio(),
                publicacion.rescatada()
        );
    }

    public static Publicacion updateUsuario(Publicacion publicacion, PublicacionDTO publicacionDTO){
        publicacion.setUsuarioNombre(publicacionDTO.usuarioNombre());
        publicacion.setUsuarioEmail(publicacionDTO.usuarioEmail());
        publicacion.setUsuarioTelefono(publicacionDTO.usuarioTelefono());
        return publicacion;
    }
}
