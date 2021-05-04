package com.qintess.clinica_veterinaria.tools;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.qintess.clinica_veterinaria.connection.ConnectionFactory;
import com.qintess.clinica_veterinaria.entidades.Animal;
import com.qintess.clinica_veterinaria.entidades.ConsultaAgendada;
import com.qintess.clinica_veterinaria.entidades.ConsultaEmergencia;

public class ClinicaTools {


	public  List<Animal> listaAnimaisEdonos() {
		EntityManager em = new ConnectionFactory().getConnection();
		List<Animal> animais = new ArrayList<Animal>();

		try {

			animais = em.createQuery("select a from Animal a inner join fetch a.donoAnimal  ", Animal.class).getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();

		return animais;
	}



	public List<ConsultaAgendada> listaConsultasAgendadaVeterinarios() {
		EntityManager em = new ConnectionFactory().getConnection();
		List<ConsultaAgendada> consultas = new ArrayList<ConsultaAgendada>();

		try {

			consultas = em.createQuery("select a from ConsultaAgendada a inner join fetch a.veterinario  ", ConsultaAgendada.class).getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();

		return consultas;

	}



	public List<ConsultaEmergencia> listaConsultasEmergenciaVeterinarios() {
		EntityManager em = new ConnectionFactory().getConnection();
		List<ConsultaEmergencia> consultas = new ArrayList<ConsultaEmergencia>();

		try {

			consultas = em.createQuery("select a from ConsultaEmergencia a inner join fetch a.veterinario  ", ConsultaEmergencia.class).getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();

		return consultas;
	}

	




}
