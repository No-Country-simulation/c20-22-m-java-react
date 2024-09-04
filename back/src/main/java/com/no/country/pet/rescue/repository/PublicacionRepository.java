package com.no.country.pet.rescue.repository;
import com.no.country.pet.rescue.entity.Publicacion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PublicacionRepository extends MongoRepository<Publicacion,String> {
}