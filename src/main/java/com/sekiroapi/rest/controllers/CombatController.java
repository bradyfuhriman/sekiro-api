package com.sekiroapi.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sekiroapi.rest.models.Prosthetic;
import com.sekiroapi.rest.models.Skill;
import com.sekiroapi.rest.services.ProstheticService;
import com.sekiroapi.rest.services.SkillService;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Combat")
public class CombatController {
    
    @Autowired
    private SkillService skillService;

    @Autowired
    private ProstheticService prostheticService;

    @Hidden
    @PostMapping("/skills/save")
    public Skill addSkill(@RequestBody Skill skill) {
        return skillService.saveSkill(skill);
    }

    @Hidden
    @PostMapping("/skills/save-many")
    public List<Skill> addSkills(@RequestBody List<Skill> skills) {
        return skillService.saveSkills(skills);
    }

    @Hidden
    @PostMapping("/prosthetics/save")
    public Prosthetic addProsthetic(@RequestBody Prosthetic prosthetic) {
        return prostheticService.saveProsthetic(prosthetic);
    }

    @Hidden
    @PostMapping("/prosthetics/save-many")
    public List<Prosthetic> addProsthetics(@RequestBody List<Prosthetic> prosthetics) {
        return prostheticService.saveProsthetics(prosthetics);
    }

    @Operation(
        description = "Get a list of all combat skills in the game."
    )
    @GetMapping("/skills")
    public List<Skill> findAllSkills() {
        return skillService.getSkills();
    }

    @Operation(
        description = "Get a list of all prosthetic tools in the game."
    )
    @GetMapping("/prosthetics")
    public List<Prosthetic> findAllProsthetics() {
        return prostheticService.getProsthetics();
    }
}
