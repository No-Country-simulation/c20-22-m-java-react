package com.no.country.pet.rescue.entities;

import com.no.country.pet.rescue.dtos.PublicacionDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Publicacion {

    @Id
    private String _id;
    private String usuarioNombre;
    private String usuarioEmail;
    private Integer usuarioTelefono;
    private String mascotaNombre;
    private String mascotaEspecie;
    private String mascotaRaza;
    private List<String> mascotaColores;
    private String mascotaTamanio;
    private String mascotaEdad;
    private String mascotaDescripcion;
    private String fecha;
    private String zona;
    private List<String> fotos;
    private Boolean publicaDuenio;
    private Boolean rescatada;

    public Publicacion(String usuarioNombre, String usuarioEmail, Integer usuarioTelefono, String mascotaNombre, String mascotaEspecie, String mascotaRaza, List<String> mascotaColores, String mascotaTamanio, String mascotaEdad, String mascotaDescripcion, String fecha, String zona, List<String> fotos, Boolean publicaDuenio, Boolean rescatada) {
        this.usuarioNombre = usuarioNombre;
        this.usuarioEmail = usuarioEmail;
        this.usuarioTelefono = usuarioTelefono;
        this.mascotaNombre = mascotaNombre;
        this.mascotaEspecie = mascotaEspecie;
        this.mascotaRaza = mascotaRaza;
        this.mascotaColores = mascotaColores;
        this.mascotaTamanio = mascotaTamanio;
        this.mascotaEdad = mascotaEdad;
        this.mascotaDescripcion = mascotaDescripcion;
        this.fecha = fecha;
        this.zona = zona;
        this.fotos = fotos;
        this.publicaDuenio = publicaDuenio;
        this.rescatada = rescatada;
    }

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
}
