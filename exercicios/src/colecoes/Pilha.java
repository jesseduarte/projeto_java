package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno principe");
		livros.push("Dom quixote"); //adiciona na pilha
		livros.push("O Hobbit");
		livros.push("O Hobbit");
		
		System.out.println("");
		
		for(String s: livros) {
			System.out.println(s);
		}
		
		
		
		System.out.println("");
		System.out.println(livros);
		System.out.println(livros.peek()); //1° elemento
		System.out.println(livros.element()); //1° elemento
		System.out.println();
		
		for(String liv: livros) {
			System.out.println(liv);
		}
		
		System.out.println();
		System.out.println(livros.pop()); //remove 1° elemento
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.remove());
		
		
		//livros.size()
		//livros.clear()
		//livros.contains()
		//livros.isEmpty()
	}
}