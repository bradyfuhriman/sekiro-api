package com.sekiroapi.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sekiroapi.rest.models.Location;
import com.sekiroapi.rest.services.LocationService;

import io.swagger.v3.oas.annotations.Hidden;

@RestController
public class LocationController {
    
    @Autowired
    private LocationService service;

    @Hidden
    @PostMapping("/locations/save")
    public Location addLocation(@RequestBody Location location) {
        return service.saveLocation(location);
    }

    @Hidden
    @PostMapping("/locations/save-many")
    public List<Location> addLocations(@RequestBody List<Location> locations) {
        return service.saveLocations(locations);
    }

    @GetMapping("/locations")
    public List<Location> findAllLocations() {
        return service.getLocations();
    }

    @GetMapping("/location/{name}")
    public Optional<Location> findLocationByName(@PathVariable String name) {
        return service.getLocationByName(name);
    }
}
