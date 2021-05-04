package com.qintess.clinica_veterinaria.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class EspecieEspecializacao {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEspecie;
	
	private String nome;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Veterinario veterinario;
	
	public EspecieEspecializacao() {}


	public EspecieEspecializacao(String nome) {
		super();
		this.nome = nome;
	}


	public Integer getIdEspecie() {
		return idEspecie;
	}

	public void setIdEspecie(Integer idEspecie) {
		this.idEspecie = idEspecie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}


	@Override
	public String toString() {
		return "EspecieEspecializacao [idEspecie=" + idEspecie + ", nome=" + nome + "]";
	}
	
	
	

	
	
	

}
