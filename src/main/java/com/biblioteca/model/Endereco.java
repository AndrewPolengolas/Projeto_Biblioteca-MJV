package com.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=90)
	private String logradouro;
	
	@Column(length=20)
	private String numero;
	
	@Column(length=90)
	private String bairro;
	
	@Column(length=90)
	private String cidade;
	
	@Column(length=2)
	private String uf;
}
