package com.qintess.clinica_veterinaria.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

	// chamando a unidade de persistencia
	private static	EntityManagerFactory emf = Persistence.createEntityManagerFactory("qintess");
	
	//metodo para conexao retonrnado o emf
	public EntityManager getConnection() {
		
		return emf.createEntityManager();
		
	}
	
}
