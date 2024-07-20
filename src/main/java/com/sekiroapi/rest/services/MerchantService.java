package com.sekiroapi.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekiroapi.rest.models.Merchant;
import com.sekiroapi.rest.repositories.MerchantRepository;

@Service
public class MerchantService {
    
    @Autowired
    private MerchantRepository repository;

    public Merchant saveMerchant(Merchant merchant) {
        return repository.save(merchant);
    }

    public List<Merchant> saveMerchants(List<Merchant> merchants) {
        return repository.saveAll(merchants);
    }

    public List<Merchant> getMerchants() {
        return repository.findAll();
    }

    public Optional<Merchant> getMerchantById(String id) {
        return repository.findById(id);
    }
}