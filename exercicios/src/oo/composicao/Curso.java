package oo.composicao;

import java.util.ArrayList;

// Aula de composicao N:N

public class Curso {
	
	final String nome;
	//A lista constante(final) quer dizer que a variavel "alunos" nao pode referenciar para outra lista. Os itens dentro dela ficam variaveis.
	final ArrayList<Aluno> alunos = new ArrayList<>(); //N:1
	
	Curso(String nome) {
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);  //Rel bidirecional
	}
}
