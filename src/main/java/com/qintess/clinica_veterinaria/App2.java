package com.qintess.clinica_veterinaria;


import javax.persistence.EntityManager;

import com.qintess.clinica_veterinaria.connection.ConnectionFactory;
import com.qintess.clinica_veterinaria.dao.DaoAnimal;
import com.qintess.clinica_veterinaria.dao.DaoConsultaEmergencia;
import com.qintess.clinica_veterinaria.dao.DaoDonoAnimal;
import com.qintess.clinica_veterinaria.dao.DaoEndereco;
import com.qintess.clinica_veterinaria.dao.DaoEspecieEspecializacao;
import com.qintess.clinica_veterinaria.dao.DaoExame;
import com.qintess.clinica_veterinaria.dao.DaoMedicamento;
import com.qintess.clinica_veterinaria.dao.DaoTratamento;
import com.qintess.clinica_veterinaria.dao.DaoVeterinario;
import com.qintess.clinica_veterinaria.entidades.Animal;
import com.qintess.clinica_veterinaria.entidades.ConsultaEmergencia;
import com.qintess.clinica_veterinaria.entidades.DonoAnimal;
import com.qintess.clinica_veterinaria.entidades.Endereco;
import com.qintess.clinica_veterinaria.entidades.EspecieEspecializacao;
import com.qintess.clinica_veterinaria.entidades.Exame;
import com.qintess.clinica_veterinaria.entidades.Medicamento;
import com.qintess.clinica_veterinaria.entidades.Tratamento;
import com.qintess.clinica_veterinaria.entidades.Veterinario;

public class App2 {

	public static void main(String[] args) {
		EntityManager em = new ConnectionFactory().getConnection();

		// CONSULTA EMERGENCIA

		DaoAnimal daoAnimal = new DaoAnimal();
		DaoDonoAnimal daoDono = new DaoDonoAnimal();
		DaoConsultaEmergencia daoConsulta = new DaoConsultaEmergencia();
		DaoVeterinario daoVeterinario = new DaoVeterinario();
		DaoEndereco daoEnderecoDono = new DaoEndereco();
		DaoEndereco daoEnderecoVet = new DaoEndereco();
		DaoEspecieEspecializacao daoSpec = new DaoEspecieEspecializacao();
		DaoExame daoExame = new DaoExame();
		DaoMedicamento daoMedicamento = new DaoMedicamento();
		DaoTratamento daoTrata = new DaoTratamento();


//		Animal animal = new Animal("Migi", "Lagarto", "Dragão barbudo", 10);
////		Animal animal2 = new Animal("Esponjinha", "Gato", "Curl Americano", 13);
//		Endereco enderecoDono = new Endereco("Dos Quebradas Place", 56, "78441");
//		DonoAnimal dono = new DonoAnimal("Heidi","Marian","4548711", "4541218");
//		dono.setEndereco(enderecoDono);
//		dono.getAnimais().add(animal);
////		dono.getAnimais().add(animal2);
//		animal.setDonoAnimal(dono);
////		animal2.setDonoAnimal(dono);
		

//		ConsultaEmergencia consulta = new ConsultaEmergencia(300.00);
//		Veterinario veterinario = new Veterinario(145, "Dr.Terri", "Vasquez", "87445", "Plantonista - Clinico Geral");
//		Endereco enderecoVet = new Endereco("Belm Manor", 454, "45471444");
//		EspecieEspecializacao espec = new EspecieEspecializacao("Espécies em Geral");


//		Exame exame = new Exame("Eletrocardiograma", "avaliar a condução elétrica do coração, apontando a possível presença de arritmias e sugerindo alterações morfológicas de câmaras cardíacas, cujo diagnóstico deve ser firmado pelo ecocardiograma.");
//		Tratamento tratamento = new Tratamento("12 em 12 horas", 2);
//		Medicamento medicamento = new Medicamento("Heart H95", "Auxiliar no controle dos batmentos cardíacos");
//		veterinario.setEndereco(enderecoVet);
//		espec.setVeterinario(veterinario);
//		veterinario.getConsultasEmerg().add(consulta);
//		veterinario.getEspecializacoes().add(espec);
//		consulta.getVeterinarios().add(veterinario);
//		consulta.setAnimal(animal);
//		consulta.setDonoAnimal(dono);
//		consulta.setVeterinario(veterinario);
//		consulta.setExame(exame);
//		veterinario.setTratamento(tratamento);
//		tratamento.setMedicamento(medicamento);
//		medicamento.setTratamento(tratamento);

		
		//para inserir novos registro, realizar as 3 persistencias abaixo, pois, esta em cascade no relacionamento.
		
//		daoDono.insere(dono);
//		daoExame.insere(exame);
//		daoVeterinario.insere(veterinario);

		
		
		
		
		
		
		
		
		




	}

}
