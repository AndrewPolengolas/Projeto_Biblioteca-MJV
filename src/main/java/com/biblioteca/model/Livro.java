package com.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Livro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer codigoBarras;
	private Double preco;
	
	@Column(length=60)
	private String titulo;
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "editora")
	private Cadastro editora;
	
	@Column(length=60)
	private String autor;
}
