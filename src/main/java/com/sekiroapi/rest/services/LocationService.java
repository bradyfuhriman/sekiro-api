package com.sekiroapi.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekiroapi.rest.models.Location;
import com.sekiroapi.rest.repositories.LocationRepository;

@Service
public class LocationService {
    
    @Autowired
    private LocationRepository repository;

    public Location saveLocation(Location location) {
        return repository.save(location);
    }

    public List<Location> saveLocations(List<Location> locations) {
        return repository.saveAll(locations);
    }

    public List<Location> getLocations() {
        return repository.findAll();
    }

    public Optional<Location> getLocationById(int id) {
        return repository.findById(id);
    }
}