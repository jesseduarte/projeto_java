package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");

		EntityManager em = emf.createEntityManager();
		
		//Para alterar o usuario de ID 7, temos que consulta-lo e depois alterar!!
		
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, 1L);
		usuario.setNome("Valtirzinho");
		usuario.setEmail("valtirzinho@lanche.com.br");
		
		em.merge(usuario); //o merge() coloca o obj em estado persistente.
		em.getTransaction().commit(); //faz a alteração no banco. ele pega o obj e altera no banco!
		
		em.close();
		emf.close();
	}
}
