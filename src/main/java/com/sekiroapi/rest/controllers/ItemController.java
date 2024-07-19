package com.sekiroapi.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sekiroapi.rest.models.Item;
import com.sekiroapi.rest.services.ItemService;

import io.swagger.v3.oas.annotations.Hidden;

@RestController
public class ItemController {
    
    @Autowired
    private ItemService service;

    @Hidden
    @PostMapping("/items/save")
    public Item addItem(@RequestBody Item item) {
        return service.saveItem(item);
    }

    @Hidden
    @PostMapping("/items/save-many")
    public List<Item> addItems(@RequestBody List<Item> items) {
        return service.saveItems(items);
    }

    @GetMapping("/items")
    public List<Item> findAllItems() {
        return service.getItems();
    }

    @GetMapping("/item/{id}")
    public Optional<Item> findItemById(@PathVariable int id) {
        return service.getItemById(id);
    }

    @GetMapping("/items/{type}")
    public List<Item> findItemsByType(@PathVariable String type) {
        return service.getItemsByType(type);
    }
}
