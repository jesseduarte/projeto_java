package dao.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {

	//Para inicializar um atributo estatico, ou inicializa no atributo direto ou
	//ou cria um bloco static para inicializa-lo.
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe; //por causa do em.createQuery(jpql,nome_classe)
	
	static { //Ele chamará o bloco, toda vez que a classe for carregada
		
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-jpa");
			
		} catch(Exception e) {
			
		}
	}
	
	public DAO() { //Criei um const padrao pra quando nao querer passar uma classe
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager(); //inicializo o em na construcao de um obj.
	}
	
	public DAO<E> abrirT() {
		em.getTransaction().begin();
		return this;
	}	
		
	public DAO<E> incluir(E entidade) {
		em.persist(entidade);
		return this;	
	}
	
	public DAO<E> fecharT() {
		em.getTransaction().commit();
		return this;	
	}
	
	public DAO<E> incluirAtomico(E entidade) {
		return this.abrirT().incluir(entidade).fecharT();
	}
	
	public List<E> obterTodos() {
		return this.obterTodos(10,0);
	}
	
	public List<E> obterTodos(int qtdeDeRegistros, int deslocamento) { //deslocamento será o OFFSET do SQL (tipo quero pegar os registros depois de pular n deslocamento.
	
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(qtdeDeRegistros);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	
	public void fechar() {
		em.close();
	}
}