package com.sekiroapi.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sekiroapi.rest.models.NPC;

@Repository
public interface NpcRepository extends JpaRepository<NPC, String> {

}