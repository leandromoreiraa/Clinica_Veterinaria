package com.qintess.clinica_veterinaria.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.qintess.clinica_veterinaria.connection.ConnectionFactory;
import com.qintess.clinica_veterinaria.entidades.DonoAnimal;
import com.qintess.clinica_veterinaria.entidades.EspecieEspecializacao;

public class DaoEspecieEspecializacao  implements DaoBase<EspecieEspecializacao>{

	

	@Override
	public EspecieEspecializacao buscaPorId(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		EspecieEspecializacao espec = null;

		try {

			espec = em.find(EspecieEspecializacao.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return espec;
	}

	@Override
	public List<EspecieEspecializacao> listaTodos() {
		EntityManager em = new ConnectionFactory().getConnection();
		List<EspecieEspecializacao> especs = null;

		try {

			especs = em.createQuery("from EspecieEspecializacao c").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();

		return especs;
	}

	@Override
	public EspecieEspecializacao insere(EspecieEspecializacao entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EspecieEspecializacao atualiza(EspecieEspecializacao entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EspecieEspecializacao deleta(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}


