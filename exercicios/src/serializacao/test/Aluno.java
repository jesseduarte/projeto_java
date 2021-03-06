package serializacao.test;

import java.io.Serializable;

public class Aluno implements Serializable {
	
	//Serializa��o = stream de objetos, vai passar varios dados de um objeto em um 
	//fluxo. jogar esses dados do objeto para um arquivo.

	/*
	 Depois que um objeto for serializado ele pode ser gravado (ou persistido) em um 
	 arquivo de dados. E recuperado do arquivo e desserializado para recriar o objeto 
	 na mem�ria.
	 
	 Com a transforma��o do objeto em bytes � poss�vel enviar o objeto por uma rede, 
	 ou salv�-lo em um arquivo ou em um banco de dados.
	 */
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String nome;
	private transient String password; //estou falando para nao serializar esse atributo. Ele retorna null
	private static String nomeEscola = "DevDojo";
	private Turma turma;
	
	public Aluno(long id, String nome, String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Aluno (" + "id=" + id +  
					", nome=" + nome + "(" +
					", password=" + password + "(" +
					", nomeEscola=" + nomeEscola + "(" +
					", turma=" + turma + "(" +
					")";
	}
	
	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static String getNomeEscola() {
		return nomeEscola;
	}
	public static void setNomeEscola(String nomeEscola) {
		Aluno.nomeEscola = nomeEscola;
	}
}