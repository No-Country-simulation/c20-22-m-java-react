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

    /**Actualiza los datos de una publicacion*/
    public static Publicacion updatePublicacion(Publicacion publicacion, PublicacionDTO publicacionDTO){
        Publicacion publicacionUpdated = new Publicacion();
        updateUsuario(publicacion,publicacionDTO);
        updateMascota(publicacion,publicacionDTO);
        updateInfo(publicacion,publicacionDTO);
        return publicacion;
    }

    /**Actualiza los datos del usuario de la publicacion.*/
    private static void updateUsuario(Publicacion publicacion, PublicacionDTO publicacionDTO){
        if(publicacionDTO.usuarioNombre()!=null)
            publicacion.setUsuarioNombre(publicacionDTO.usuarioNombre());

        if(publicacionDTO.usuarioEmail()!=null)
            publicacion.setUsuarioEmail(publicacionDTO.usuarioEmail());

        if(publicacionDTO.usuarioTelefono()!=null)
            publicacion.setUsuarioTelefono(publicacionDTO.usuarioTelefono());
    }

    /**Actualiza los datos de la mascota de la publicacion.*/
    private static void updateMascota(Publicacion publicacion, PublicacionDTO publicacionDTO){
        if(publicacionDTO.mascotaNombre()!=null)
            publicacion.setMascotaNombre(publicacionDTO.mascotaNombre());

        if(publicacionDTO.mascotaEspecie()!=null)
            publicacion.setMascotaEspecie(publicacionDTO.mascotaEspecie());

        if(publicacionDTO.mascotaRaza()!=null)
            publicacion.setMascotaRaza(publicacionDTO.mascotaRaza());

        if(publicacionDTO.mascotaColores()!=null)
            publicacion.setMascotaColores(publicacionDTO.mascotaColores());

        if(publicacionDTO.mascotaTamanio()!=null)
            publicacion.setMascotaTamanio(publicacionDTO.mascotaTamanio());

        if(publicacionDTO.mascotaEdad()!=null)
            publicacion.setMascotaEdad(publicacionDTO.mascotaEdad());

        if(publicacionDTO.mascotaDescripcion()!=null)
            publicacion.setMascotaDescripcion(publicacionDTO.mascotaDescripcion());
    }

    /**Actualiza informacion extra de la publicacion.*/
    private static void updateInfo(Publicacion publicacion, PublicacionDTO publicacionDTO){
        if(publicacionDTO.fecha()!=null)
            publicacion.setFecha(publicacionDTO.fecha());

        if(publicacionDTO.zona()!=null)
            publicacion.setZona(publicacionDTO.zona());

        if(publicacionDTO.fotos()!=null)//REVISAR
            publicacion.setFotos(publicacionDTO.fotos());

        if(publicacionDTO.publicaDuenio()!=null)
            publicacion.setPublicaDuenio(publicacionDTO.publicaDuenio());

        if(publicacionDTO.rescatada()!=null)
            publicacion.setRescatada(publicacionDTO.rescatada());
    }
}
