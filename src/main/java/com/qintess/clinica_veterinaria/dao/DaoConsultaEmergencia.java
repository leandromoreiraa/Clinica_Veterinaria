package com.qintess.clinica_veterinaria.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.qintess.clinica_veterinaria.connection.ConnectionFactory;
import com.qintess.clinica_veterinaria.entidades.ConsultaAgendada;
import com.qintess.clinica_veterinaria.entidades.ConsultaEmergencia;

public class DaoConsultaEmergencia implements DaoBase<ConsultaEmergencia>{

	

	

	@Override
	public ConsultaEmergencia buscaPorId(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		ConsultaEmergencia consulta = null;

		try {

			consulta = em.find(ConsultaEmergencia.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return consulta;
	}

	@Override
	public List<ConsultaEmergencia> listaTodos() {
		EntityManager em = new ConnectionFactory().getConnection();
		List<ConsultaEmergencia> consultas = null;

		try {

			consultas = em.createQuery("from ConsultaEmergencia c").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();

		return consultas;
	}

	@Override
	public ConsultaEmergencia insere(ConsultaEmergencia entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultaEmergencia atualiza(ConsultaEmergencia entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultaEmergencia deleta(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
