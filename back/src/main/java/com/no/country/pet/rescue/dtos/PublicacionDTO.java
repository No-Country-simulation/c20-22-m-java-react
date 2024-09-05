package com.no.country.pet.rescue.dtos;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record PublicacionDTO(
        String usuarioNombre,
        String usuarioEmail,
        Integer usuarioTelefono,
        String mascotaNombre,
        String mascotaEspecie,
        String mascotaRaza,
        List<String>mascotaColores,
        String mascotaTamanio,
        String mascotaEdad,
        String mascotaDescripcion,
        String fecha,
        String zona,
        List<String> fotos,
        Boolean publicaDuenio,
        Boolean rescatada
) {
}
