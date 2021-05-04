package com.qintess.clinica_veterinaria.entidades;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Animal {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAnimal;
	
	private String nomeAnimal;
	
	private String especie;
	
	private String raca;

	private Integer idade;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private DonoAnimal donoAnimal;
	
	public Animal() {}

	public Animal(String nomeAnimal, String especie, String raca, Integer idade) {
		super();
		this.nomeAnimal = nomeAnimal;
		this.especie = especie;
		this.raca = raca;
		this.idade = idade;
	}

	public Integer getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(Integer idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public DonoAnimal getDonoAnimal() {
		return donoAnimal;
	}

	public void setDonoAnimal(DonoAnimal donoAnimal) {
		this.donoAnimal = donoAnimal;
	}

	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", nomeAnimal=" + nomeAnimal + ", especie=" + especie + ", raca=" + raca
				+ ", idade=" + idade + "]";
	}
	
	

	

	

	

	
	
	

}
