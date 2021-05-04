package com.qintess.clinica_veterinaria;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EntityManager;

import com.qintess.clinica_veterinaria.connection.ConnectionFactory;
import com.qintess.clinica_veterinaria.dao.DaoAnimal;
import com.qintess.clinica_veterinaria.dao.DaoConsultaAgendada;
import com.qintess.clinica_veterinaria.dao.DaoConsultaEmergencia;
import com.qintess.clinica_veterinaria.dao.DaoDonoAnimal;
import com.qintess.clinica_veterinaria.dao.DaoEndereco;
import com.qintess.clinica_veterinaria.dao.DaoEspecieEspecializacao;
import com.qintess.clinica_veterinaria.dao.DaoExame;
import com.qintess.clinica_veterinaria.dao.DaoMedicamento;
import com.qintess.clinica_veterinaria.dao.DaoTratamento;
import com.qintess.clinica_veterinaria.dao.DaoVeterinario;
import com.qintess.clinica_veterinaria.entidades.Animal;
import com.qintess.clinica_veterinaria.entidades.ConsultaAgendada;
import com.qintess.clinica_veterinaria.entidades.DonoAnimal;
import com.qintess.clinica_veterinaria.entidades.Endereco;
import com.qintess.clinica_veterinaria.entidades.EspecieEspecializacao;
import com.qintess.clinica_veterinaria.entidades.Exame;
import com.qintess.clinica_veterinaria.entidades.Medicamento;
import com.qintess.clinica_veterinaria.entidades.Tratamento;
import com.qintess.clinica_veterinaria.entidades.Veterinario;

public class App1 
{
	public static void main( String[] args )
	{
		EntityManager em = new ConnectionFactory().getConnection();

		//CONSULTA AGENDADA

		    	DaoAnimal daoAnimal = new DaoAnimal();
				DaoDonoAnimal daoDono = new DaoDonoAnimal();
				DaoConsultaAgendada daoConsulta = new DaoConsultaAgendada();
				DaoVeterinario daoVeterinario = new DaoVeterinario();
				DaoEndereco daoEnderecoDono = new DaoEndereco();
				DaoEndereco daoEnderecoVet = new DaoEndereco();
				DaoEspecieEspecializacao daoSpec = new DaoEspecieEspecializacao();
				DaoExame daoExame = new DaoExame();
				DaoMedicamento daoMedicamento = new DaoMedicamento();
				DaoTratamento daoTrata = new DaoTratamento();


//		    	Animal animal = new Animal("Exibida", "Gado bovino", "Angus", 8);
//		    	Animal animal2 = new Animal("Ruana", "Gado bovino", "Chilanina", 9);
//				Endereco enderecoDono = new Endereco("Sincelejo Place", 344, "01452");
//				DonoAnimal dono = new DonoAnimal("Joanne","Robertson", "454541", "748798");
//				dono.setEndereco(enderecoDono);
//				dono.getAnimais().add(animal);
//				dono.getAnimais().add(animal2);
//				animal.setDonoAnimal(dono);
//				animal2.setDonoAnimal(dono);
		
				
//				ConsultaAgendada consulta = new ConsultaAgendada(LocalDate.of(2021, 8, 14), LocalTime.of(12, 30), 689.90);
//				Veterinario veterinario = new Veterinario(778, "Dr.Andre","Henderson", "454574200", "Geriatria");
//				Endereco enderecoVet = new Endereco("Hingsons Ville", 78447, "741002");
//				EspecieEspecializacao espec = new EspecieEspecializacao("Gado bovino");
			
				
//				Exame exame = new Exame("Ultrassonografia", "Realizar manutenção da qualidade de vida em periodos de Gestação");
//				Tratamento tratamento = new Tratamento("a cada 7 dias", 1);
//				Medicamento medicamento = new Medicamento("Vitamina D", "além de ajudar a diminuir o risco de aborto espontâneo, a vitamina D também promove o crescimento saudável da placenta e pode reduz risco de pré-eclâmpsia.");
//				Medicamento med = new Medicamento("Vitamina B9", "importante para a formação do sistema nervoso do feto, ajudando no fechamento do tubo neural, uma estrutura embrionária que dará origem ao cérebro e à medula espinhal");
//				veterinario.setEndereco(enderecoVet);
//				espec.setVeterinario(veterinario);
//				veterinario.getConsultas().add(consulta);
//				veterinario.getEspecializacoes().add(espec);
//				consulta.getVeterinarios().add(veterinario);
//				consulta.setAnimal(animal);
//				consulta.setDonoAnimal(dono);
//				consulta.setVeterinario(veterinario);
//				consulta.setExame(exame);
//				veterinario.setTratamento(tratamento);
//				tratamento.setMedicamento(medicamento);
//				tratamento.setMedicamento(med);
//				medicamento.setTratamento(tratamento);
//				med.setTratamento(tratamento);


		//para inserir novos registro, realizar as 2 persistencias abaixo, pois, esta em cascade no relacionamento.

//				daoDono.insere(dono);
//				daoVeterinario.insere(veterinario);






	}
}
