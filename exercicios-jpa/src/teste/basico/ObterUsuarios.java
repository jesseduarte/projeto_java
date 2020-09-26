package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {
	
	//Nao existe funcionalidade no ENTITYMANAGER para consultar varios objs Usuarios!!
	//Com isso, iremos usar o JPQL.
	
	/*
	 * Queries are represented in JPA 2 by two interfaces - the old Query interface, 
	 * which was the only interface available for representing queries in JPA 1, and 
	 * the new TypedQuery interface that was introduced in JPA 2. The TypedQuery 
	 * interface extends the Query interface.
	 */
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
									.createEntityManagerFactory("exercicios-jpa");
		
		EntityManager em = emf.createEntityManager();
		
		//Vamos fazer consulta em cima dos atributos do proprio obj!
		//Essa consulta irá trazer todos os atributos e objetos da tabela tipo o (select *...)
		String jpql = "select u from Usuario u"; //Usuario é o nome da classe e nao da tabela! O JPA irá converter para tabela!
		
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class); //Ele pega a referencia da classe para pegar os atributos e dados dela.
		query.setMaxResults(5); //pega no maximo os 5 primeiros resultados dessa consulta.
		
		List<Usuario> usuarios = query.getResultList(); //Aqui que ele vai efetivar a consulta e jogar o resultado na lista
		
		/* MODO SIMPLIFICADO:
		List<Usuario> usuarios = em
					.createQuery("select u from Usuario u", Usuario.class)
					.setMaxResults(5)
					.getResultList();
		*/
		for(Usuario u: usuarios) {
			System.out.println(u.getId() + "----" + u.getNome());
		}
		
		em.close();
		emf.close();
	}
}