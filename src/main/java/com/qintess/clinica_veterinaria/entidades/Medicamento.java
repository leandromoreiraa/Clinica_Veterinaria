package com.qintess.clinica_veterinaria.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Medicamento {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMedicamento;
	
	private String nome;
	
	private String descricao;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Tratamento tratamento;
	
	public Medicamento() {}

	public Medicamento(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}

	public Integer getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(Integer idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Tratamento getTratamento() {
		return tratamento;
	}

	public void setTratamento(Tratamento tratamento) {
		this.tratamento = tratamento;
	}

	@Override
	public String toString() {
		return "Medicamento [idMedicamento=" + idMedicamento + ", nome=" + nome + ", descricao=" + descricao + "]";
	}



	
	
	
	

}
