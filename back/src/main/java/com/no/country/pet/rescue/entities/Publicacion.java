package com.no.country.pet.rescue.entities;

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
}
