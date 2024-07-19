package com.sekiroapi.rest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "skills")
public class Skill {
    
    @Id private String name;
    private String description;
    private int cost;
}
