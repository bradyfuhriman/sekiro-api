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
import com.sekiroapi.rest.services.MerchantService;

import io.swagger.v3.oas.annotations.Hidden;

@RestController
public class MerchantController {
    
    @Autowired
    private MerchantService service;

    @Hidden
    @PostMapping("/merchants/save")
    public Merchant addMerchant(@RequestBody Merchant merchant) {
        return service.saveMerchant(merchant);
    }

    @Hidden
    @PostMapping("/merchants/save-many")
    public List<Merchant> addMerchants(@RequestBody List<Merchant> merchants) {
        return service.saveMerchants(merchants);
    }

    @GetMapping("/merchants")
    public List<Merchant> findAllMerchants() {
        return service.getMerchants();
    }

    @GetMapping("/merchant/{name}")
    public Optional<Merchant> findMerchantByName(@PathVariable String name) {
        return service.getMerchantByName(name);
    }
}
