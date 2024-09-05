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
    private String mascota_nombre;
    private String mascota_especie;
    private String mascota_raza;
    private List<String> mascota_colores;
    private String mascotaTamanio;
    private String mascota_edad;
    private String mascotaDescripcion;
    private String fecha;
    private String zona;
    private List<String> fotos;
    private Boolean publicaDuenio;
    private Boolean rescatada;

    public Publicacion(String usuarioNombre, String usuarioEmail, Integer usuarioTelefono, String mascota_nombre, String mascota_especie, String mascota_raza, List<String> mascota_colores, String mascotaTamanio, String mascota_edad, String mascotaDescripcion, String fecha, String zona, List<String> fotos, Boolean publicaDuenio, Boolean rescatada) {
        this.usuarioNombre = usuarioNombre;
        this.usuarioEmail = usuarioEmail;
        this.usuarioTelefono = usuarioTelefono;
        this.mascota_nombre = mascota_nombre;
        this.mascota_especie = mascota_especie;
        this.mascota_raza = mascota_raza;
        this.mascota_colores = mascota_colores;
        this.mascotaTamanio = mascotaTamanio;
        this.mascota_edad = mascota_edad;
        this.mascotaDescripcion = mascotaDescripcion;
        this.fecha = fecha;
        this.zona = zona;
        this.fotos = fotos;
        this.publicaDuenio = publicaDuenio;
        this.rescatada = rescatada;
    }
}
