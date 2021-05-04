package com.qintess.clinica_veterinaria.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ConsultaEmergencia {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idConsultaEmergencia;
	
	private Double valorConsulta;
	
	@ManyToMany(mappedBy = "consultasEmerg", fetch = FetchType.LAZY)
	private List<Veterinario> veterinarios = new ArrayList<Veterinario>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Exame exame;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private DonoAnimal donoAnimal;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Animal animal;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Veterinario veterinario;
	
	
	
	public ConsultaEmergencia() {}

	public ConsultaEmergencia(Double valorConsulta) {
		super();
		this.valorConsulta = valorConsulta;
	}

	public Integer getIdConsultaEmergencia() {
		return idConsultaEmergencia;
	}

	public void setIdConsultaEmergencia(Integer idConsultaEmergencia) {
		this.idConsultaEmergencia = idConsultaEmergencia;
	}

	public Double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(Double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public DonoAnimal getDonoAnimal() {
		return donoAnimal;
	}

	public void setDonoAnimal(DonoAnimal donoAnimal) {
		this.donoAnimal = donoAnimal;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public List<Veterinario> getVeterinarios() {
		return veterinarios;
	}

	public void setVeterinarios(List<Veterinario> veterinarios) {
		this.veterinarios = veterinarios;
	}


	

	

	
	
	

}
