package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		System.out.println("Distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(2) //quero pular 2 elementos!!
			.limit(2) //quero pegar s� 2 elementos!!
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
			.distinct()
			.takeWhile(a -> a.nota >= 8) //pega o elemento at� satisfizer essa condicao, se tiver alguem no meio que nao satisfaz essa condicao, ele d� um break!!
			.skip(1)
			.forEach(System.out::println);
		
		System.out.println("");
		//alunos.stream()
		//.dropWhile(a -> a.nota > 7.0)
		//.forEach(System.out::println);
	}
}