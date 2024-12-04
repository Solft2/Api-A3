package com.a3.api.Resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.a3.api.Entity.Item;
import com.a3.api.Services.ItemService;

@RestController
@RequestMapping(value = "/Itens")
public class ItemResource {
	
	@Autowired
	private ItemService service;
	
	@GetMapping
	public ResponseEntity<List<Item>> findAll(){
		List<Item> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
    @GetMapping(value = "/{id}")
<<<<<<< HEAD
    public ResponseEntity<Item> findById(@PathVariable Long id){
=======
    public ResponseEntity<Item> findById(@PathVariable String id){
>>>>>>> bc6c2db3ab999a76cf2c858cd1232196cf6d5635
    	Item obj = service.findById(id);
    	return ResponseEntity.ok().body(obj);
    }
    @PostMapping
    public ResponseEntity<Item> insert(@RequestBody Item obj){
    	obj = service.insert(obj);
    	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getNome()).toUri();
    	return ResponseEntity.created(uri).body(obj);
    }
    @DeleteMapping(value = "/{id}")
<<<<<<< HEAD
    public ResponseEntity<Void> delete(@PathVariable Long id){
=======
    public ResponseEntity<Void> delete(@PathVariable String id){
>>>>>>> bc6c2db3ab999a76cf2c858cd1232196cf6d5635
    	service.delete(id);
    	return ResponseEntity.noContent().build();
    }
    
    @PutMapping(value = "/{id}")
<<<<<<< HEAD
    public ResponseEntity<Item> update(@PathVariable Long id, @RequestBody Item obj){
=======
    public ResponseEntity<Item> update(@PathVariable String id, @RequestBody Item obj){
>>>>>>> bc6c2db3ab999a76cf2c858cd1232196cf6d5635
    	obj = service.update(id,obj);
    	return ResponseEntity.ok().body(obj);
    }
 }
