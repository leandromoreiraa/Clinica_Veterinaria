package com.qintess.clinica_veterinaria.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.qintess.clinica_veterinaria.connection.ConnectionFactory;
import com.qintess.clinica_veterinaria.entidades.Exame;

public class DaoExame implements DaoBase<Exame>{

	

	@Override
	public Exame buscaPorId(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Exame exame = null;

		try {

			exame = em.find(Exame.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return exame;
	}

	@Override
	public List<Exame> listaTodos() {
		EntityManager em = new ConnectionFactory().getConnection();
		List<Exame> exames = null;

		try {

			exames = em.createQuery("from Exame c").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();

		return exames;
	}

	@Override
	public Exame insere(Exame entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exame atualiza(Exame entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exame deleta(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
