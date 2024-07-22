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
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Items")
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

    @Operation(
        description = "Get a list of all items in the game."
    )
    @GetMapping("/items")
    public List<Item> findAllItems() {
        return service.getItems();
    }

    @Operation(
        description = "Get an item by its ID."
    )
    @GetMapping("/item/{id}")
    public Optional<Item> findItemById(@PathVariable String id) {
        return service.getItemById(id);
    }

    @Operation(
        description = "Get a list of items of a particular type. Valid item types include ```key item```, ```progression item```, ```skill text```, ```document```, ```key```, ```memory```, ```remnant```, ```rot essence```, ```prosthetic upgrade```, ```upgrade material```, and ```consumable```."
    )
    @GetMapping("/items/{type}")
    public List<Item> findItemsByType(@PathVariable String type) {
        return service.getItemsByType(type);
    }
}
