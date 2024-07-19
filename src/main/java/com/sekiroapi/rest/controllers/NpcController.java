package com.sekiroapi.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sekiroapi.rest.models.Npc;
import com.sekiroapi.rest.services.NpcService;

import io.swagger.v3.oas.annotations.Hidden;

@RestController
public class NpcController {
    
    @Autowired
    private NpcService service;

    @Hidden
    @PostMapping("/npcs/save")
    public Npc addNpc(@RequestBody Npc npc) {
        return service.saveNpc(npc);
    }

    @Hidden
    @PostMapping("/npcs/save-many")
    public List<Npc> addNpcs(@RequestBody List<Npc> npcs) {
        return service.saveNpcs(npcs);
    }

    @GetMapping("/npcs")
    public List<Npc> findAllNpcs() {
        return service.getNpcs();
    }

    @GetMapping("/npc/{name}")
    public Optional<Npc> findNpcByName(@PathVariable String name) {
        return service.getNpcByName(name);
    }
}
