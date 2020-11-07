package br.com.alura.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class AlteraSaldoConta {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Conta contaGuilherme = em.find(Conta.class, 1L);
		
		System.out.println("Conta do Guilherme -> " + contaGuilherme.getTitular());
		
		em.getTransaction().begin();
		
		contaGuilherme.setSaldo(20.00);
		
		em.getTransaction().commit();
	}

}
