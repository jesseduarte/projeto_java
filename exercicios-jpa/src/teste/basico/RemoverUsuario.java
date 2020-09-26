package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");

		EntityManager em = emf.createEntityManager();
		
		Usuario u = new Usuario();
		
		u = em.find(Usuario.class, 1L); //Coloca no modo managed
		
		if(u != null) {
			em.getTransaction().begin();
			em.remove(u); //irá remover, pq está no modo managed
			em.getTransaction().commit();
			System.out.println("Usuario removido");
		} else {
			System.out.println("Usuario nao encontrado!");
		}
		
		em.close();
		emf.close();
	}
}