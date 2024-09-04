package com.noCountry.petRescue.entities;

import com.noCountry.petRescue.dtos.PublicationDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "publication")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Publication {

    @Transient
    public static final String SEQUENCE_NAME = "user_sequence";

    @Id
    private Long id;
    private boolean publishesTheOwner;
    private boolean found;
    private String petName;
    private String date;
    private String location;
    private String petSpecies;
    private String breed;
    private String colors;
    private String size;
    private int age;
    private String petDescription;
    private List<String> photo = new ArrayList<>();
    private String ownerName;
    private String ownerEmail;
    private String ownersPhoneNumber;

    public Publication(boolean publishesTheOwner, String petName, String date, String location, String petSpecies, String breed, String colors, String size, int age, String petDescription, List<String> photo, String ownerName, String ownerEmail, String ownersPhoneNumber) {
        this.publishesTheOwner = publishesTheOwner;
        this.found = false;
        this.petName = petName;
        this.date = date;
        this.location = location;
        this.petSpecies = petSpecies;
        this.breed = breed;
        this.colors = colors;
        this.size = size;
        this.age = age;
        this.petDescription = petDescription;
        this.photo = photo;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownersPhoneNumber = ownersPhoneNumber;
    }

    public static Publication publicationDTOToPublication(PublicationDTO publicationDTO) {
        return new Publication(
                publicationDTO.publishesTheOwner(),
                publicationDTO.petName(),
                publicationDTO.date(),
                publicationDTO.location(),
                publicationDTO.petSpecies(),
                publicationDTO.breed(),
                publicationDTO.colors(),
                publicationDTO.size(),
                publicationDTO.age(),
                publicationDTO.petDescription(),
                publicationDTO.photo(),
                publicationDTO.ownerName(),
                publicationDTO.ownerEmail(),
                publicationDTO.ownersPhoneNumber()
        );
    }

    public static PublicationDTO publicationToPublicationDTO(Publication publication) {
        return new PublicationDTO(
                publication.isPublishesTheOwner(),
                publication.isFound(),
                publication.getPetName(),
                publication.getDate(),
                publication.getLocation(),
                publication.getPetSpecies(),
                publication.getBreed(),
                publication.getColors(),
                publication.getSize(),
                publication.getAge(),
                publication.getPetDescription(),
                publication.getPhoto(),
                publication.getOwnerName(),
                publication.getOwnerEmail(),
                publication.getOwnersPhoneNumber()
        );
    }


}
