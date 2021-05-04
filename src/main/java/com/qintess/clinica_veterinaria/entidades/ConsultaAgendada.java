package com.qintess.clinica_veterinaria.entidades;

import java.time.LocalDate;
import java.time.LocalTime;
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
public class ConsultaAgendada {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idConsultaAgendada;

	private LocalDate dataAtendimento;
	
	private LocalTime horaAtendimento;

	private Double valorConsulta;
	
	
	@ManyToMany(mappedBy = "consultas",fetch = FetchType.LAZY)
	private List<Veterinario> veterinarios = new ArrayList<Veterinario>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Exame exame;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private DonoAnimal donoAnimal;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Animal animal;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Veterinario veterinario;
	
	public ConsultaAgendada() {}


	public ConsultaAgendada(LocalDate dataAtendimento, LocalTime horaAtendimento, Double valorConsulta) {
		super();
		this.dataAtendimento = dataAtendimento;
		this.horaAtendimento = horaAtendimento;
		this.valorConsulta = valorConsulta;
	}


	public Integer getIdConsultaAgendada() {
		return idConsultaAgendada;
	}


	public void setIdConsultaAgendada(Integer idConsultaAgendada) {
		this.idConsultaAgendada = idConsultaAgendada;
	}


	public LocalDate getDataAtendimento() {
		return dataAtendimento;
	}


	public void setDataAtendimento(LocalDate dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}


	public LocalTime getHoraAtendimento() {
		return horaAtendimento;
	}


	public void setHoraAtendimento(LocalTime horaAtendimento) {
		this.horaAtendimento = horaAtendimento;
	}


	public Double getValorConsulta() {
		return valorConsulta;
	}


	public void setValorConsulta(Double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}


	public List<Veterinario> getVeterinarios() {
		return veterinarios;
	}


	public void setVeterinarios(List<Veterinario> veterinarios) {
		this.veterinarios = veterinarios;
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


	@Override
	public String toString() {
		return "ConsultaAgendada [idConsultaAgendada=" + idConsultaAgendada + ", dataAtendimento=" + dataAtendimento
				+ ", horaAtendimento=" + horaAtendimento + ", valorConsulta=" + valorConsulta + "]";
	}

	
	

	

	

	

	
	
	
	

	




}
