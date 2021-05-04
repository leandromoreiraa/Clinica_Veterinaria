package com.qintess.clinica_veterinaria.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Exame {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idExame;
	
	private String nomeExame;
	
	private String diagnostico;
	
	
	public Exame() {}



	public Exame(String nomeExame, String diagnostico) {
		super();
		this.nomeExame = nomeExame;
		this.diagnostico = diagnostico;
	}



	public Integer getIdExame() {
		return idExame;
	}



	public void setIdExame(Integer idExame) {
		this.idExame = idExame;
	}



	public String getNomeExame() {
		return nomeExame;
	}



	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}



	public String getDiagnostico() {
		return diagnostico;
	}



	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}



	@Override
	public String toString() {
		return "Exame [idExame=" + idExame + ", nomeExame=" + nomeExame + ", diagnostico=" + diagnostico + "]";
	}






	
	
	

}
