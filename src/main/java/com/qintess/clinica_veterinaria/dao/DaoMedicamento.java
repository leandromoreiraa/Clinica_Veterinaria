package com.qintess.clinica_veterinaria.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.qintess.clinica_veterinaria.connection.ConnectionFactory;
import com.qintess.clinica_veterinaria.entidades.Medicamento;

public class DaoMedicamento implements DaoBase<Medicamento>{

	

	

	@Override
	public Medicamento buscaPorId(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Medicamento medicamento = null;

		try {

			medicamento = em.find(Medicamento.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return medicamento;
	}

	@Override
	public List<Medicamento> listaTodos() {
		EntityManager em = new ConnectionFactory().getConnection();
		List<Medicamento> medicamentos = null;

		try {

			medicamentos = em.createQuery("from Medicamento c").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();

		return medicamentos;
	}

	@Override
	public Medicamento insere(Medicamento entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Medicamento atualiza(Medicamento entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Medicamento deleta(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
