package com.sekiroapi.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekiroapi.rest.models.Item;
import com.sekiroapi.rest.repositories.ItemRepository;

@Service
public class ItemService {
    
    @Autowired
    private ItemRepository repository;

    public Item saveItem(Item item) {
        return repository.save(item);
    }

    public List<Item> saveItems(List<Item> items) {
        return repository.saveAll(items);
    }

    public List<Item> getItems() {
        return repository.findAll();
    }

    public Optional<Item> getItemById(int id) {
        return repository.findById(id);
    }

    public List<Item> getItemsByType(String type) {
        return repository.findByType(type);
    }
}
