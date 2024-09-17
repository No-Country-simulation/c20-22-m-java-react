package com.no.country.pet.rescue.dtos;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record PublicacionDTO(
        String _id,
        @NotBlank(message = "El nombre del usuario es obligatorio")
        String usuarioNombre,
        @NotBlank(message = "El correo del usuario es obligatorio")
        @Email(message = "El email no existe")
        @Pattern(regexp = "^[\\w-\\.]+@[\\w-]+(\\.[\\w-]{2,})+$", message = "El email debe contener un dominio válido")
        String usuarioEmail,
        @NotNull(message = "El numero de telefono es obligatorio")
        Long usuarioTelefono,
        String mascotaNombre,
        @NotBlank(message = "La especie de la mascota es obligatoria")
        String mascotaEspecie,
        @NotBlank(message = "La raza de la mascota es obligatorio")
        String mascotaRaza,
        @NotNull(message = "Los colores de la mascota son obligatorios")
        @Size(min = 1, message = "Debe haber al menos un color en la lista")
        @Valid
        List<@NotBlank(message = "El color de la mascota no puede estar en blanco") String>mascotaColores,
        @NotBlank(message = "El tamaño de la mascota es obligatorio")
        String mascotaTamanio,
        String mascotaEdad,
        @NotBlank(message = "Es necesario tener mas imformacion que ayude a identificar la mascota")
        String mascotaDescripcion,
        @NotBlank(message = "La fecha del suceso es obligatoria")
        String fecha,
        @NotBlank(message = "La zona es obligatoria")
        String zona,
        @NotNull(message = "Los colores de la mascota son obligatorios")
        @Size(min = 1, message = "Debe haber al menos un color en la lista")
        @Valid
        List<@NotBlank(message = "El path de la imagen no puede estar en blanco") String> fotos,
        Boolean publicaDuenio,
        Boolean rescatada
) {
}
