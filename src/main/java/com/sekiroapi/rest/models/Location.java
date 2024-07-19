package com.sekiroapi.rest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "locations")
public class Location {
    
    @Id private String name;
    private String description;
    private String npcs;
    private String bosses;
    private String items;
    private String enemies;
}
