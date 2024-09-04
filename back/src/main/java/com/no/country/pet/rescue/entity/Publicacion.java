package com.no.country.pet.rescue.entity;

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
    private String fechaPerdida;
    private String zona;
    private List<String> fotos;
    private Boolean publicaDuenio;
    private Boolean rescatada;
}
