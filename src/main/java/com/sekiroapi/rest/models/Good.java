package com.sekiroapi.rest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "goods")
public class Good {
    
    @Id private String name;
    private String amount;
    private String cost;

    @ManyToOne(fetch = FetchType.LAZY)
    Merchant merchant;
}
