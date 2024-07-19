package com.sekiroapi.rest.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "merchants")
public class Merchant {
    
    @Id private String name;
    private String description;
    private List<String> locations;
    private List<String> goods; // one to many?
}
