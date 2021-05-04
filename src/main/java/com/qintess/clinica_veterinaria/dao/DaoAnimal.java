package com.qintess.clinica_veterinaria.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.qintess.clinica_veterinaria.connection.ConnectionFactory;
import com.qintess.clinica_veterinaria.entidades.Animal;

public class DaoAnimal implements DaoBase<Animal> {

	@Override
	public Animal insere(Animal animal) {
		EntityManager em = new ConnectionFactory().getConnection();

		try {

			em.getTransaction().begin();

			em.persist(animal);

			em.getTransaction().commit();

			em.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return animal;
	}



	@Override
	public Animal buscaPorId(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Animal animal = null;

		try {

			animal = em.find(Animal.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return animal;
	}

	@Override
	public List<Animal> listaTodos() {
		EntityManager em = new ConnectionFactory().getConnection();
		List<Animal> animais = null;

		try {

			animais = em.createQuery("from Animal c").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();

		return animais;
	}


	@Override
	public Animal atualiza(Animal entidade) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Animal deleta(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}







}
