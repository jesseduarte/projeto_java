package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");

		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, 1L);
		usuario.setNome("Valtirzinho");
		
		em.detach(usuario); //tirando o obj do estado managed(persistente) e colocando ele no estado detached(desligado)
		
		em.merge(usuario); //descomentando essa linha, o obj sai do detached e entra no managed, e com isso persiste! 
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
