package com.qintess.clinica_veterinaria.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.qintess.clinica_veterinaria.connection.ConnectionFactory;
import com.qintess.clinica_veterinaria.entidades.Endereco;

public class DaoEndereco  implements DaoBase<Endereco>{

	@Override
	public Endereco insere(Endereco endereco) {
		EntityManager em = new ConnectionFactory().getConnection();

		try {

			em.getTransaction().begin();

			em.persist(endereco);

			em.getTransaction().commit();

			em.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return endereco;
	}

	@Override
	public Endereco atualiza(Endereco endereco) {
		EntityManager em = new ConnectionFactory().getConnection();

		try {

			em.getTransaction().begin();

			em.merge(endereco);

			em.getTransaction().commit();

			em.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return endereco;
	}

	

	@Override
	public Endereco buscaPorId(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Endereco endereco = null;

		try {

			endereco = em.find(Endereco.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return endereco;
	}

	@Override
	public List<Endereco> listaTodos() {
		EntityManager em = new ConnectionFactory().getConnection();
		List<Endereco> enderecos = null;

		try {

			enderecos = em.createQuery("from Endereco c").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();

		return enderecos;
	}

	@Override
	public Endereco deleta(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
