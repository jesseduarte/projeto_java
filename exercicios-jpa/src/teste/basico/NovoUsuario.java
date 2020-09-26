package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
		//Vamos utilizar o objeto EntityManagerFactory:
		//Responsavel por criar os entityManagers (cria uma fabrica de conexoes entityManager)
		//Se tiver mais de um BD, crio mais EMFs para criar seus EMs!
		
		//Vamos utilizar o objeto EntityManager:
		//Responsavel por inserir uma entidade, alterar, excluir, consultar!
		//É o cara que fará o CRUD (ele vai receber um obj, vai entender que o obj tem
		// um mapeamento e vai converter os dados do obj em comandos SQL).
		//Dentro do EntityManager ja estará embutido uma conexao com um BD e irá persistir.
		
		EntityManagerFactory emf = Persistence
									.createEntityManagerFactory("exercicios-jpa"); //Unit-persistence = qual é o nome do BD que vc quer conectar
		
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Priscilla", "priscilla@lanche.com.br");
		
		em.getTransaction().begin();
		em.persist(novoUsuario); //inseri um obj no banco de dados!! Tipo inst SQL insert
		em.getTransaction().commit(); //Confirmo a insercao do obj
		
		em.close();
		emf.close();
	}
}