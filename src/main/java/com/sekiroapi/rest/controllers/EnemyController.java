package com.sekiroapi.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sekiroapi.rest.models.Enemy;
import com.sekiroapi.rest.services.EnemyService;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Enemies")
public class EnemyController {
    
    @Autowired
    private EnemyService service;

    @Hidden
    @PostMapping("/enemies/save")
    public Enemy addEnemy(@RequestBody Enemy enemy) {
        return service.saveEnemy(enemy);
    }

    @Hidden
    @PostMapping("/enemies/save-many")
    public List<Enemy> addEnemies(@RequestBody List<Enemy> enemies) {
        return service.saveEnemies(enemies);
    }

    @Operation(
        description = "Get a list of all enemies in the game."
    )
    @GetMapping("/enemies")
    public List<Enemy> findAllEnemies() {
        return service.getEnemies();
    }

    @Operation(
        description = "Get an enemy with a specific ID."
    )
    @GetMapping("/enemy/{id}")
    public Optional<Enemy> findEnemyById(@PathVariable int id) {
        return service.getEnemyById(id);
    }

    @Operation(
        description = "Get a list of enemies of a particular type. Valid enemy types include ```common enemy```, ```mini-boss```, and ```main boss```."
    )
    @GetMapping("/enemies/{type}")
    public List<Enemy> findEnemiesByType(@PathVariable String enemies) {
        return service.getEnemiesByType(enemies);
    }
}
