package com.sekiroapi.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekiroapi.rest.models.Npc;
import com.sekiroapi.rest.repositories.NpcRepository;

@Service
public class NpcService {
    
    @Autowired
    private NpcRepository repository;

    public Npc saveNpc(Npc npc) {
        return repository.save(npc);
    }

    public List<Npc> saveNpcs(List<Npc> npcs) {
        return repository.saveAll(npcs);
    }

    public List<Npc> getNpcs() {
        return repository.findAll();
    }

    public Optional<Npc> getNpcByName(String name) {
        return repository.findById(name);
    }
}