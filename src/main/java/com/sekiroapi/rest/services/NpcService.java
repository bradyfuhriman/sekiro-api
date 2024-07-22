package com.sekiroapi.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekiroapi.rest.models.NPC;
import com.sekiroapi.rest.repositories.NpcRepository;

@Service
public class NpcService {
    
    @Autowired
    private NpcRepository repository;

    public NPC saveNpc(NPC npc) {
        return repository.save(npc);
    }

    public List<NPC> saveNpcs(List<NPC> npcs) {
        return repository.saveAll(npcs);
    }

    public List<NPC> getNpcs() {
        return repository.findAll();
    }

    public Optional<NPC> getNpcById(String id) {
        return repository.findById(id);
    }
}