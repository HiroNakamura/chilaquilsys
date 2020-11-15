package com.inforhomex.chilaquilsys.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.inforhomex.chilaquilsys.entities.Libro;

@RepositoryRestResource
public interface LibroRestRepository extends JpaRepository<Libro, Integer> {

}