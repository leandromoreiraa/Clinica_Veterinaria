package com.qintess.clinica_veterinaria.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.qintess.clinica_veterinaria.connection.ConnectionFactory;
import com.qintess.clinica_veterinaria.entidades.Animal;
import com.qintess.clinica_veterinaria.entidades.ConsultaAgendada;

public class DaoConsultaAgendada implements DaoBase<ConsultaAgendada> {


	@Override
	public ConsultaAgendada buscaPorId(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		ConsultaAgendada consulta = null;

		try {

			consulta = em.find(ConsultaAgendada.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return consulta;
	}

	@Override
	public List<ConsultaAgendada> listaTodos() {
		EntityManager em = new ConnectionFactory().getConnection();
		List<ConsultaAgendada> consultas = null;

		try {

			consultas = em.createQuery("from ConsultaAgendada c").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();

		return consultas;
	}

	@Override
	public ConsultaAgendada insere(ConsultaAgendada entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultaAgendada atualiza(ConsultaAgendada entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultaAgendada deleta(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
