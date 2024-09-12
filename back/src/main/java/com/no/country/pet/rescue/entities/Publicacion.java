package com.no.country.pet.rescue.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Publicacion {

    @Id
    private String _id;
    @Field("usuario_nombre")
    private String usuarioNombre;
    @Field("usuario_email")
    private String usuarioEmail;
    @Field("usuario_telefono")
    private Long usuarioTelefono;
    @Field("mascota_nombre")
    private String mascotaNombre;
    @Field("mascota_especie")
    private String mascotaEspecie;
    @Field("mascota_raza")
    private String mascotaRaza;
    @Field("mascota_colores")
    private List<String> mascotaColores;
    @Field("mascota_tamanio")
    private String mascotaTamanio;
    @Field("mascota_edad")
    private String mascotaEdad;
    @Field("mascota_descripcion")
    private String mascotaDescripcion;
    @Field("fecha")
    private String fecha;
    @Field("zona")
    private String zona;
    @Field("fotos")
    private List<String> fotos;
    @Field("publica_duenio")
    private Boolean publicaDuenio;
    @Field("rescatada")
    private Boolean rescatada;

    public Publicacion(String usuarioNombre, String usuarioEmail, Long usuarioTelefono, String mascotaNombre, String mascotaEspecie, String mascotaRaza, List<String> mascotaColores, String mascotaTamanio, String mascotaEdad, String mascotaDescripcion, String fecha, String zona, List<String> fotos, Boolean publicaDuenio, Boolean rescatada) {
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
