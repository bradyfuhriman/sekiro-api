package com.sekiroapi.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekiroapi.rest.models.Enemy;
import com.sekiroapi.rest.repositories.EnemyRepository;

@Service
public class EnemyService {
    
    @Autowired
    private EnemyRepository repository;

    public Enemy saveEnemy(Enemy enemy) {
        return repository.save(enemy);
    }

    public List<Enemy> saveEnemies(List<Enemy> enemies) {
        return repository.saveAll(enemies);
    }

    public List<Enemy> getEnemies() {
        return repository.findAll();
    }

    public Optional<Enemy> getEnemyByName(String name) {
        return repository.findById(name);
    }

    public List<Enemy> getEnemiesByType(String type) {
        return repository.findByType(type);
    }
}
