package com.qintess.clinica_veterinaria.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.qintess.clinica_veterinaria.connection.ConnectionFactory;
import com.qintess.clinica_veterinaria.entidades.DonoAnimal;

public class DaoDonoAnimal implements DaoBase<DonoAnimal>{

	@Override
	public DonoAnimal insere(DonoAnimal dono) {
		EntityManager em = new ConnectionFactory().getConnection();

		try {

			em.getTransaction().begin();

			em.persist(dono);

			em.getTransaction().commit();

			em.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dono;
	}

	

	@Override
	public DonoAnimal buscaPorId(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		DonoAnimal dono = null;

		try {

			dono = em.find(DonoAnimal.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return dono;
	}

	@Override
	public List<DonoAnimal> listaTodos() {
		EntityManager em = new ConnectionFactory().getConnection();
		List<DonoAnimal> donos = null;

		try {

			donos = em.createQuery("from DonoAnimal c").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();

		return donos;
	}



	@Override
	public DonoAnimal atualiza(DonoAnimal entidade) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public DonoAnimal deleta(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
