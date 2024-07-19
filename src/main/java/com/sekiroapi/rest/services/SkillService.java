package com.sekiroapi.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekiroapi.rest.models.Skill;
import com.sekiroapi.rest.repositories.SkillRepository;

@Service
public class SkillService {
    
    @Autowired
    private SkillRepository repository;

    public Skill saveSkill(Skill skill) {
        return repository.save(skill);
    }

    public List<Skill> saveSkills(List<Skill> skills) {
        return repository.saveAll(skills);
    }

    public List<Skill> getSkills() {
        return repository.findAll();
    }

    public Optional<Skill> getSkillByName(String name) {
        return repository.findById(name);
    }
}