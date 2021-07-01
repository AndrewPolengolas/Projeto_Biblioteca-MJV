package com.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cadastro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=60)
	private String nome;
	
	@Column(length = 11)
	private Long telefone;
	
	@Column(length=90)
	private String email;
	
	@OneToOne
	@JoinColumn(name = "endereco")
	private Endereco endereco;
	
	@Column(length=20)
	private String CNPJ;
}
