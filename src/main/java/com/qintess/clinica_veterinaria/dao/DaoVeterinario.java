package com.qintess.clinica_veterinaria.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.qintess.clinica_veterinaria.connection.ConnectionFactory;
import com.qintess.clinica_veterinaria.entidades.Veterinario;

public class DaoVeterinario implements DaoBase<Veterinario>{

	@Override
	public Veterinario insere(Veterinario veterinario) {
		EntityManager em = new ConnectionFactory().getConnection();

		try {

			em.getTransaction().begin();

			em.persist(veterinario);

			em.getTransaction().commit();

			em.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return veterinario;
	}

	

	@Override
	public Veterinario buscaPorId(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Veterinario veterinario = null;

		try {

			veterinario = em.find(Veterinario.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return veterinario;
	}

	@Override
	public List<Veterinario> listaTodos() {
		EntityManager em = new ConnectionFactory().getConnection();
		List<Veterinario> veterinarios = null;

		try {

			veterinarios = em.createQuery("from Veterinario c").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();

		return veterinarios;
	}



	@Override
	public Veterinario atualiza(Veterinario entidade) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Veterinario deleta(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
