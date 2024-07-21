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

@RestController
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

    @GetMapping("/enemies")
    public List<Enemy> findAllEnemies() {
        return service.getEnemies();
    }

    @GetMapping("/enemies/{id}")
    public Optional<Enemy> findEnemyById(@PathVariable int id) {
        return service.getEnemyById(id);
    }

    @GetMapping("/enemies/{type}")
    public List<Enemy> findEnemiesByType(@PathVariable String enemies) {
        return service.getEnemiesByType(enemies);
    }
}
