package com.no.country.pet.rescue.repositories;
import com.no.country.pet.rescue.entities.Publicacion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PublicacionRepository extends MongoRepository<Publicacion,String> {
}