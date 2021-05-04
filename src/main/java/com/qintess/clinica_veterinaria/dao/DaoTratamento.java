package com.qintess.clinica_veterinaria.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.qintess.clinica_veterinaria.connection.ConnectionFactory;
import com.qintess.clinica_veterinaria.entidades.Tratamento;

public class DaoTratamento implements DaoBase<Tratamento>{


	@Override
	public Tratamento buscaPorId(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Tratamento tratamento = null;

		try {

			tratamento = em.find(Tratamento.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return tratamento;
	}

	@Override
	public List<Tratamento> listaTodos() {
		EntityManager em = new ConnectionFactory().getConnection();
		List<Tratamento> tratamentos = null;

		try {

			tratamentos = em.createQuery("from Tratamento c").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();

		return tratamentos;
	}

	@Override
	public Tratamento insere(Tratamento entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tratamento atualiza(Tratamento entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tratamento deleta(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
