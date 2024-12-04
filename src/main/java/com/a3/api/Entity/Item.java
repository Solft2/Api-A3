package com.a3.api.Entity;

/** 
 * @author Dhomyny R F Souza
 * @version 1.0
 */

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
<<<<<<< HEAD
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
=======
>>>>>>> bc6c2db3ab999a76cf2c858cd1232196cf6d5635
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
<<<<<<< HEAD
@Table(name = "tb_item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
=======
@Table()
public class Item {
    @Id
>>>>>>> bc6c2db3ab999a76cf2c858cd1232196cf6d5635
    private String nome;

    @Column
    private BigDecimal valor;

    @Column
    private String descricao;

<<<<<<< HEAD
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
=======
    public String getNome() {
>>>>>>> bc6c2db3ab999a76cf2c858cd1232196cf6d5635
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Item() {
    }

    public Item(String nome, BigDecimal valor, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    
}
