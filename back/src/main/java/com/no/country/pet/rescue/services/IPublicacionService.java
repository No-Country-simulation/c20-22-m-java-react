package com.no.country.pet.rescue.services;
import com.no.country.pet.rescue.dtos.DetailsToUpdateDTO;
import com.no.country.pet.rescue.dtos.PublicacionDTO;
import java.util.List;

public interface IPublicacionService {
    PublicacionDTO save(PublicacionDTO publicacion);
    List<PublicacionDTO> getAll();
    PublicacionDTO findById(String idPublicacion);
    PublicacionDTO update(String idPublicacion, DetailsToUpdateDTO publicacionDTO);
    String deleteById(String idPublicacion);
    List<PublicacionDTO> getAllOwnerPublishes();
    List<PublicacionDTO> getAllOwnerNonPublishes();
    List<PublicacionDTO> getAllRescuedPets();
}