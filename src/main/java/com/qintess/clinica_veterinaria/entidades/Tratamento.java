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
public class Tratamento {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTratamento;
	
	private String horarioAplicacao;
	
	private Integer quantidade;
	
	@OneToMany(mappedBy = "tratamento", fetch = FetchType.LAZY)
	private List<Medicamento> medicamentos = new ArrayList<Medicamento>();
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Medicamento medicamento;
	
	public Tratamento() {}

	public Tratamento(String horarioAplicacao, Integer quantidade) {
		super();
		this.horarioAplicacao = horarioAplicacao;
		this.quantidade = quantidade;
	}

	public Integer getIdTratamento() {
		return idTratamento;
	}

	public void setIdTratamento(Integer idTratamento) {
		this.idTratamento = idTratamento;
	}

	public String getHorarioAplicacao() {
		return horarioAplicacao;
	}

	public void setHorarioAplicacao(String horarioAplicacao) {
		this.horarioAplicacao = horarioAplicacao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	@Override
	public String toString() {
		return "Tratamento [idTratamento=" + idTratamento + ", horarioAplicacao=" + horarioAplicacao + ", quantidade="
				+ quantidade + "]";
	}






	
	

	

	

	

	
	
	
	

}
