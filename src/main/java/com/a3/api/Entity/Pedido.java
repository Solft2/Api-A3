package com.a3.api.Entity;

/**
 * @author Dhomyny R F Souza
 * @version 1.0
 */

import java.util.Map;

<<<<<<< HEAD
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
=======
import jakarta.persistence.Column;
>>>>>>> bc6c2db3ab999a76cf2c858cd1232196cf6d5635
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyJoinColumn;
=======
>>>>>>> bc6c2db3ab999a76cf2c858cd1232196cf6d5635

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

<<<<<<< HEAD
    @ElementCollection
    @CollectionTable(name = "pedido_itens", joinColumns = @JoinColumn(name = "pedido_id"))
    @MapKeyJoinColumn(name = "item_id")
    @Column(name = "quantidade")
=======
    @Column
>>>>>>> bc6c2db3ab999a76cf2c858cd1232196cf6d5635
    private Map<Item,String> itens;
    
    @Column
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map<Item, String> getItens() {
        return itens;
    }

    public void setItens(Map<Item, String> itens) {
        this.itens = itens;
    }

    public Pedido(Integer id, Map<Item, String> itens) {
        this.id = id;
        this.itens = itens;
    }

    public Pedido() {
    }

    
}
