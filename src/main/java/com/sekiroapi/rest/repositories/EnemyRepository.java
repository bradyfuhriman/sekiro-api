package com.sekiroapi.rest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sekiroapi.rest.models.Enemy;

@Repository
public interface EnemyRepository extends JpaRepository<Enemy, Integer> {

    List<Enemy> findByType(String type);
}
