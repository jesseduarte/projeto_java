package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");

		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, 1L);
		usuario.setNome("Valtirzinho alterado");
		
		//em.merge(usuario);
		em.getTransaction().commit(); //Ocorre a alt pq o met find() coloca o obj no estado managed (persistente)
		
		em.close();
		emf.close();
	}
}
//O ideal é depois de ter feito a transaction, deixar o obj no estado detached. Só
//quando for usar ele novamente, colocar ele no estado managed(persistente).