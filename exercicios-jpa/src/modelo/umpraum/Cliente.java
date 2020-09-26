package modelo.umpraum;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	//No Rel um-um, temos que escolher qual é a entidade que é mais importante
	//Entre a entidade Cliente e Assento, a ent Cliente tem mais importancia.
	//logo, iremos colocar a classe Assento como "atributo" da classe Cliente.
	
	//Antes deu erro, quando eu incluia um cliente primeiro numa transacao e depois
	//incluia o assento em outra transacao. 
	//Para eu poder incluir um cliente primeiro, mesmo nao tendo assento ainda, uso o 
	//atributo "cascade" como atrib da anotacao @OneToOne. A operacao em cascata
	//(cascade) realiza uma acao em cascata.
	
	@OneToOne(cascade = CascadeType.PERSIST) //Por causa dessa anotacao, será criado na tab Cliente um atrib chamado assento_id! E no "persist" irá persistir em cascata (irá incluir o Cliente e ja após o Assento)
	@JoinColumn(name = "assento_id", unique = true) //fazer a relacao da coluna
	private Assento assento; //assim esse atrib pode acessar qlq met da classe Assento.
	
	public Cliente() {
		
	}

	public Cliente(String nome, Assento assento) {
		this.nome = nome;
		this.assento = assento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}
}