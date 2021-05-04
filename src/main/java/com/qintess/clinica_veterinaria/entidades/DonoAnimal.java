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
public class DonoAnimal {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDonoAnimal;
	
	private String nomeDono;
	
	private String sobreNome;
	
	private String cpf;
	
	private String telefone;
	
	@OneToMany(mappedBy = "donoAnimal", cascade = CascadeType.ALL)
	private List<Animal> animais = new ArrayList<Animal>();
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	
	public DonoAnimal() {}

	public DonoAnimal(String nomeDono, String sobreNome, String cpf, String telefone) {
		super();
		this.nomeDono = nomeDono;
		this.sobreNome = sobreNome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public Integer getIdDonoAnimal() {
		return idDonoAnimal;
	}

	public void setIdDonoAnimal(Integer idDonoAnimal) {
		this.idDonoAnimal = idDonoAnimal;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "DonoAnimal [idDonoAnimal=" + idDonoAnimal + ", nomeDono=" + nomeDono + ", sobreNome=" + sobreNome
				+ ", cpf=" + cpf + ", telefone=" + telefone + "]";
	}






	
	
	
	
	
	

}
