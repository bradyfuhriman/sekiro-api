package com.sekiroapi.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sekiroapi.rest.models.Prosthetic;

@Repository
public interface ProstheticRepository extends JpaRepository<Prosthetic, Integer> {

}
