package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
								.createEntityManagerFactory("exercicios-jpa");
		
		EntityManager em = emf.createEntityManager();
		
		//No caso de Consulta(Select) nao precisa de transacao!!
		
		Usuario usuario = em.find(Usuario.class, 3L); //Coloco a classe do model (Usuario) e no seg param coloco o id do que quero buscar
		System.out.println(usuario.getNome());
		
		em.close();
		emf.close();
	}
}
