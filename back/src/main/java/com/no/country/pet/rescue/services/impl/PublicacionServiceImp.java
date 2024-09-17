package com.no.country.pet.rescue.services.impl;
import com.no.country.pet.rescue.dtos.DetailsToUpdateDTO;
import com.no.country.pet.rescue.dtos.PublicacionDTO;
import com.no.country.pet.rescue.entities.Publicacion;
import com.no.country.pet.rescue.exceptions.PublicacionNotFoundException;
import com.no.country.pet.rescue.repositories.PublicacionRepository;
import com.no.country.pet.rescue.services.IPublicacionService;
import com.no.country.pet.rescue.utils.ConvertirPublicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PublicacionServiceImp implements IPublicacionService {

    @Autowired
    private PublicacionRepository publicacionRepository;

    @Override
    public PublicacionDTO save(PublicacionDTO publicacion) {

        Publicacion publicacionToSave = ConvertirPublicacion.publicacionDTOToPublicacion(publicacion);

        publicacionRepository.save(publicacionToSave);

        return publicacion;
    }

    @Override
    public List<PublicacionDTO> getAll() {
        List<Publicacion> publicaciones = publicacionRepository.findAll();
        List<PublicacionDTO> publicacionesDTO = new ArrayList<>();
        for(Publicacion publicacion: publicaciones){
            publicacionesDTO.add(ConvertirPublicacion.publicacionToPublicacionDTO(publicacion));
        }
        return publicacionesDTO;
    }

    @Override
    public PublicacionDTO findById(String id) {

        Publicacion publicacion = publicacionRepository.findById(id)
                .orElseThrow(() -> new PublicacionNotFoundException("La publicacion con ID : " + id + " no existe"));

        return ConvertirPublicacion.publicacionToPublicacionDTO(publicacion);
    }

    @Override
    public PublicacionDTO update(String idPublicacion, DetailsToUpdateDTO publicacionDTO){
        Optional<Publicacion> publicacionOptional = publicacionRepository.findById(idPublicacion);
        if (publicacionOptional.isPresent()){
            Publicacion publicacionUpdated = ConvertirPublicacion.updatePublicacion(publicacionOptional.get(),publicacionDTO);
            publicacionRepository.save(publicacionUpdated);
            return ConvertirPublicacion.publicacionToPublicacionDTO(publicacionUpdated);
        }else
            return null;
    }

    @Override
    public String deleteById(String idPublicacion) {
        publicacionRepository.deleteById(idPublicacion);
        return "User id: " + idPublicacion + " deleted";
    }

    @Override
    public List<PublicacionDTO> getAllOwnerPublishes() {

        List<Publicacion> publicaciones = publicacionRepository.findAll();
        List<PublicacionDTO> publicacionesToReturn = new ArrayList<>();

        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getPublicaDuenio() && !publicacion.getRescatada()) {
                publicacionesToReturn.add(ConvertirPublicacion.publicacionToPublicacionDTO(publicacion));
            }
        }

        return publicacionesToReturn;
    }

    @Override
    public List<PublicacionDTO> getAllOwnerNonPublishes() {

        List<Publicacion> publicaciones = publicacionRepository.findAll();
        List<PublicacionDTO> publicacionesToReturn = new ArrayList<>();

        for (Publicacion publicacion : publicaciones) {
            if (!publicacion.getPublicaDuenio() && !publicacion.getRescatada()) {
                publicacionesToReturn.add(ConvertirPublicacion.publicacionToPublicacionDTO(publicacion));
            }
        }

        return publicacionesToReturn;
    }

    @Override
    public List<PublicacionDTO> getAllRescuedPets() {

        List<Publicacion> publicaciones = publicacionRepository.findAll();
        List<PublicacionDTO> publicacionesToReturn = new ArrayList<>();

        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getRescatada()) {
                publicacionesToReturn.add(ConvertirPublicacion.publicacionToPublicacionDTO(publicacion));
            }
        }

        return publicacionesToReturn;
    }
}