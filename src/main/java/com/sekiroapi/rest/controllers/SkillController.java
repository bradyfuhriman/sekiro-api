package com.sekiroapi.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sekiroapi.rest.models.Skill;
import com.sekiroapi.rest.services.SkillService;

import io.swagger.v3.oas.annotations.Hidden;

@RestController
public class SkillController {
    
    @Autowired
    private SkillService service;

    @Hidden
    @PostMapping("/skills/save")
    public Skill addSkill(@RequestBody Skill skill) {
        return service.saveSkill(skill);
    }

    @Hidden
    @PostMapping("/skills/save-many")
    public List<Skill> addSkills(@RequestBody List<Skill> skills) {
        return service.saveSkills(skills);
    }

    @GetMapping("/skills")
    public List<Skill> findAllSkills() {
        return service.getSkills();
    }

    @GetMapping("/skill/{name}")
    public Optional<Skill> findSkillByName(@PathVariable String name) {
        return service.getSkillByName(name);
    }
}
