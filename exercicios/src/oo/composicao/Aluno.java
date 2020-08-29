package oo.composicao;

import java.util.ArrayList;

//Aula de composicao N:N

public class Aluno {
	
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome) {
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
