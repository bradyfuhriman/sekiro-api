package com.sekiroapi.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sekiroapi.rest.models.Merchant;
import com.sekiroapi.rest.models.Npc;
import com.sekiroapi.rest.services.MerchantService;
import com.sekiroapi.rest.services.NpcService;

import io.swagger.v3.oas.annotations.Hidden;

@RestController
public class NpcController {
    
    @Autowired
    private NpcService npcService;

    @Autowired
    private MerchantService merchantService;

    @Hidden
    @PostMapping("/npcs/save")
    public Npc addNpc(@RequestBody Npc npc) {
        return npcService.saveNpc(npc);
    }

    @Hidden
    @PostMapping("/npcs/save-many")
    public List<Npc> addNpcs(@RequestBody List<Npc> npcs) {
        return npcService.saveNpcs(npcs);
    }

    @Hidden
    @PostMapping("/merchants/save")
    public Merchant addMerchant(@RequestBody Merchant merchant) {
        return merchantService.saveMerchant(merchant);
    }

    @Hidden
    @PostMapping("/merchants/save-many")
    public List<Merchant> addMerchants(@RequestBody List<Merchant> merchants) {
        return merchantService.saveMerchants(merchants);
    }

    @GetMapping("/npcs")
    public List<Npc> findAllNpcs() {
        return npcService.getNpcs();
    }

    @GetMapping("/npcs/{id}")
    public Optional<Npc> findNpcById(@PathVariable int id) {
        return npcService.getNpcById(id);
    }

    @GetMapping("/merchants")
    public List<Merchant> findAllMerchants() {
        return merchantService.getMerchants();
    }

    @GetMapping("/merchants/{id}")
    public Optional<Merchant> findMerchantById(@PathVariable String id) {
        return merchantService.getMerchantById(id);
    }
}
