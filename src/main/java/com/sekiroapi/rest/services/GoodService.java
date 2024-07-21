package com.sekiroapi.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekiroapi.rest.models.Good;
import com.sekiroapi.rest.repositories.GoodRepository;

@Service
public class GoodService {
    
    @Autowired
    private GoodRepository repository;

    public Good saveGood(Good good) {
        return repository.save(good);
    }

    public List<Good> saveGoods(List<Good> goods) {
        return repository.saveAll(goods);
    }

    public List<Good> getGoods() {
        return repository.findAll();
    }

    public Optional<Good> getGoodById(int id) {
        return repository.findById(id);
    }
}
