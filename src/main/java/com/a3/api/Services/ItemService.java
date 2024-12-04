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
	
<<<<<<< HEAD
	public Item findById(Long id) {
=======
	public Item findById(String id) {
>>>>>>> bc6c2db3ab999a76cf2c858cd1232196cf6d5635
		Optional<Item> obj = repository.findById(id);
		return obj.get();
	}
    
	public Item insert(Item obj) {
		return repository.save(obj);
	}
	
<<<<<<< HEAD
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Item update(Long id, Item obj) {
=======
	public void delete(String id) {
		repository.deleteById(id);
	}
	
	public Item update(String id, Item obj) {
>>>>>>> bc6c2db3ab999a76cf2c858cd1232196cf6d5635
		Item entity = repository.getReferenceById(id);
		updateData(entity,obj);
		return repository.save(entity);
	}

	private void updateData(Item entity, Item obj) {
		entity.setDescricao(obj.getDescricao());
		entity.setNome(obj.getNome());
		entity.setValor(obj.getValor());
		
	}
}
