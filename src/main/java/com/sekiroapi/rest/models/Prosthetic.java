package com.sekiroapi.rest.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "prosthetics")
public class Prosthetic {
    
    @Id private String name;
    private String description;
    private int cost;
    private List<String> upgrades;
}
