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
import javax.persistence.OneToOne;

@Entity
public class Veterinario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVeterinario;
	
	private Integer crmv;
	
	private String nomeVeterinario;
	
	private String sobreNome;
	
	private String telefone;
	
	private String especialidade;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="consultaAgendada_veterinario",
    joinColumns= @JoinColumn(name="veterinario_id"),
    inverseJoinColumns= @JoinColumn(name="consulta_agendada_id"))
	private List<ConsultaAgendada> consultas = new ArrayList<ConsultaAgendada>();
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="consultaEmergencia_veterinario",
    joinColumns= @JoinColumn(name="veterinario_id"),
    inverseJoinColumns= @JoinColumn(name="consulta_emergencia_id"))
	private List<ConsultaEmergencia> consultasEmerg = new ArrayList<ConsultaEmergencia>();
	
	
	@OneToMany(mappedBy = "veterinario", cascade = CascadeType.ALL)
	private List<EspecieEspecializacao> especializacoes = new ArrayList<EspecieEspecializacao>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Tratamento tratamento;
	
	
	public Veterinario() {}


	public Veterinario(Integer crmv, String nomeVeterinario, String sobreNome, String telefone, String especialidade) {
		super();
		this.crmv = crmv;
		this.nomeVeterinario = nomeVeterinario;
		this.sobreNome = sobreNome;
		this.telefone = telefone;
		this.especialidade = especialidade;
	}


	public Integer getIdVeterinario() {
		return idVeterinario;
	}


	public void setIdVeterinario(Integer idVeterinario) {
		this.idVeterinario = idVeterinario;
	}


	public Integer getCrmv() {
		return crmv;
	}


	public void setCrmv(Integer crmv) {
		this.crmv = crmv;
	}


	public String getNomeVeterinario() {
		return nomeVeterinario;
	}


	public void setNomeVeterinario(String nomeVeterinario) {
		this.nomeVeterinario = nomeVeterinario;
	}


	public String getSobreNome() {
		return sobreNome;
	}


	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public List<ConsultaAgendada> getConsultas() {
		return consultas;
	}


	public void setConsultas(List<ConsultaAgendada> consultas) {
		this.consultas = consultas;
	}


	public List<ConsultaEmergencia> getConsultasEmerg() {
		return consultasEmerg;
	}


	public void setConsultasEmerg(List<ConsultaEmergencia> consultasEmerg) {
		this.consultasEmerg = consultasEmerg;
	}


	public List<EspecieEspecializacao> getEspecializacoes() {
		return especializacoes;
	}


	public void setEspecializacoes(List<EspecieEspecializacao> especializacoes) {
		this.especializacoes = especializacoes;
	}


	public Tratamento getTratamento() {
		return tratamento;
	}


	public void setTratamento(Tratamento tratamento) {
		this.tratamento = tratamento;
	}


	@Override
	public String toString() {
		return "Veterinario [idVeterinario=" + idVeterinario + ", crmv=" + crmv + ", nomeVeterinario=" + nomeVeterinario
				+ ", sobreNome=" + sobreNome + ", telefone=" + telefone + ", especialidade=" + especialidade + "]";
	}





	
	

	
	

	

}
