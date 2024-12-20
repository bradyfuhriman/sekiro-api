package com.sekiroapi.rest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sekiroapi.rest.models.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {

    List<Item> findByType(String type);

    @Query("FROM Item WHERE UPPER(name) LIKE %?#{[0].toUpperCase()}%")
    List<Item> findByNameContainingIgnoreCase(String name);
}
