package com.example.apirestpersonasfiestasrelaciones.repositorios;

import com.example.apirestpersonasfiestasrelaciones.entidades.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {
    Collection<Persona> findAll();
}
