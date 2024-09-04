package com.noCountry.petRescue.dtos;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.time.LocalDate;
import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record PublicationDTO(
        boolean publishesTheOwner,
        boolean found,
        String petName,
        String date,
        String location,
        String petSpecies,
        String breed,
        String colors,
        String size,
        int age,
        String petDescription,
        List<String> photo,
        String ownerName,
        String ownerEmail,
        String ownersPhoneNumber
) {
}
