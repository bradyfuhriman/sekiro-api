package com.sekiroapi.rest.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "items")
public class Item {
    
    @Id private String id;
    private String name;
    @Column(length=1000) private String description;
    private String type;
    private String effect;
    private String capacity;
}
