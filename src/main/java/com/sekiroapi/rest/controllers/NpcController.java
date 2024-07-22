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
import com.sekiroapi.rest.models.NPC;
import com.sekiroapi.rest.services.MerchantService;
import com.sekiroapi.rest.services.NpcService;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "NPCs")
public class NpcController {
    
    @Autowired
    private NpcService npcService;

    @Autowired
    private MerchantService merchantService;

    @Hidden
    @PostMapping("/npcs/save")
    public NPC addNpc(@RequestBody NPC npc) {
        return npcService.saveNpc(npc);
    }

    @Hidden
    @PostMapping("/npcs/save-many")
    public List<NPC> addNpcs(@RequestBody List<NPC> npcs) {
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

    @Operation(
        description = "Get a list of all NPCs in the game."
    )
    @GetMapping("/npcs")
    public List<NPC> findAllNpcs() {
        return npcService.getNpcs();
    }

    @Operation(
        description = "Get an NPC with a specific ID."
    )
    @GetMapping("/npc/{id}")
    public Optional<NPC> findNpcById(@PathVariable String id) {
        return npcService.getNpcById(id);
    }

    @Operation(
        description = "Get a list of all merchants in the game."
    )
    @GetMapping("/merchants")
    public List<Merchant> findAllMerchants() {
        return merchantService.getMerchants();
    }

    @Operation(
        description = "Get a merchant with a specific ID."
    )
    @GetMapping("/merchants/{id}")
    public Optional<Merchant> findMerchantById(@PathVariable String id) {
        return merchantService.getMerchantById(id);
    }
}
