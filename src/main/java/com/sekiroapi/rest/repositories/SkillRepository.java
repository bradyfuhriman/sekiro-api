package com.sekiroapi.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sekiroapi.rest.models.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
