package com.sekiroapi.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekiroapi.rest.models.Prosthetic;
import com.sekiroapi.rest.repositories.ProstheticRepository;

@Service
public class ProstheticService {
    
    @Autowired
    private ProstheticRepository repository;

    public Prosthetic saveProsthetic(Prosthetic prosthetic) {
        return repository.save(prosthetic);
    }

    public List<Prosthetic> saveProsthetics(List<Prosthetic> prosthetics) {
        return repository.saveAll(prosthetics);
    }

    public List<Prosthetic> getProsthetics() {
        return repository.findAll();
    }

    public Optional<Prosthetic> getProstheticByName(String name) {
        return repository.findById(name);
    }
}