package br.com.cod3r.exerciciossb.model.entities;

public class Cliente {
	
	private int id;
	private String nome;
	private String cpf; //como nao utilizarei para realizar op matematicas e tambem
						//se for inteiro, ele desconsidera o zero a esquerda. Entao,
						//colocarei o cpf, assim como RG (f.ex), como tipo String!
	
	public Cliente(int id, String nome, String cpf) {
			this.id = id;
			this.nome = nome;
			this.cpf = cpf;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}