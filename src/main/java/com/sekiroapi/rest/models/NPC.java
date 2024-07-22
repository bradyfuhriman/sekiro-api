package com.sekiroapi.rest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "npcs")
public class NPC {
    
    @Id private String id;
    private String name;
    private String description;
    private String location;
}
