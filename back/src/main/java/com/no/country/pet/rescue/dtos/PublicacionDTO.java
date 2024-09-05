package com.no.country.pet.rescue.dtos;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record PublicacionDTO(
        String usuarioNombre,
        String usuarioEmail,
        Integer usuarioTelefono,
        String mascota_nombre,
        String mascota_especie,
        String mascota_raza,
        List<String>mascota_colores,
        String mascotaTamanio,
        String mascota_edad,
        String mascotaDescripcion,
        String fecha,
        String zona,
        List<String> fotos,
        Boolean publicaDuenio,
        Boolean rescatada
) {
}
