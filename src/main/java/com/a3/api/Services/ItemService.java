package com.a3.api.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a3.api.Entity.Item;
import com.a3.api.Repository.itemRepository;

@Service
public class ItemService {
    
    @Autowired
    private itemRepository repository;
    
    public List<Item> findAll(){
        return repository.findAll();
    }
    
    public Item findById(Long id) {
        Optional<Item> obj = repository.findById(id);
        return obj.get();
    }
    
    public Item insert(Item obj) {
        return repository.save(obj);
    }
    
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
    public Item update(Long id, Item obj) {
        Item entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Item entity, Item obj) {
        entity.setCategory(obj.getCategory());
        entity.setCover(obj.getCover());
        entity.setDescription(obj.getDescription());
        entity.setName(obj.getName());
        entity.setPrice(obj.getPrice());
        
    }
}