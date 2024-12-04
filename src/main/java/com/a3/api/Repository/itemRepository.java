package com.a3.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.a3.api.Entity.Item;

@Repository
<<<<<<< HEAD
public interface itemRepository extends JpaRepository<Item,Long> {
=======
public interface itemRepository extends JpaRepository<Item,String> {
>>>>>>> bc6c2db3ab999a76cf2c858cd1232196cf6d5635

}
