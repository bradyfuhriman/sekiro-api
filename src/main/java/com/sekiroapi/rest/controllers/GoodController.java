package com.sekiroapi.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sekiroapi.rest.models.Good;
import com.sekiroapi.rest.services.GoodService;

import io.swagger.v3.oas.annotations.Hidden;

@RestController
public class GoodController {
    
    @Autowired
    private GoodService service;

    @Hidden
    @PostMapping("/goods/save")
    public Good addGood(@RequestBody Good Good) {
        return service.saveGood(Good);
    }

    @Hidden
    @PostMapping("/goods/save-many")
    public List<Good> addGoods(@RequestBody List<Good> enemies) {
        return service.saveGoods(enemies);
    }
}
