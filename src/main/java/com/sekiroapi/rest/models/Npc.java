package com.sekiroapi.rest.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "npcs")
public class Npc {
    
    @Id private String name;
    private String description;
    private List<String> locations;
}
