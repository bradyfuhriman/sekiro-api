package com.sekiroapi.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sekiroapi.rest.models.Prosthetic;
import com.sekiroapi.rest.services.ProstheticService;

import io.swagger.v3.oas.annotations.Hidden;

@RestController
public class ProstheticController {
 
    @Autowired
    private ProstheticService service;

    @Hidden
    @PostMapping("/prosthetics/save")
    public Prosthetic addProsthetic(@RequestBody Prosthetic prosthetic) {
        return service.saveProsthetic(prosthetic);
    }

    @Hidden
    @PostMapping("/prosthetics/save-many")
    public List<Prosthetic> addProsthetics(@RequestBody List<Prosthetic> prosthetics) {
        return service.saveProsthetics(prosthetics);
    }

    @GetMapping("/prosthetics")
    public List<Prosthetic> findAllProsthetics() {
        return service.getProsthetics();
    }

    @GetMapping("/prosthetic/{name}")
    public Optional<Prosthetic> findProstheticByName(@PathVariable String name) {
        return service.getProstheticByName(name);
    }
}
