package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<>();
		
		//Diferen�a do add() pro offer(). quando a fila chega no limite: add() = lan�a uma excecao. offer() = retorna um false
		
		filaBanco.add("Ana");
		filaBanco.offer("Bia");
		filaBanco.add("Carlos");
		filaBanco.offer("Daniel");
		filaBanco.add("Rafaela");
		filaBanco.offer("Gui");
		filaBanco.offer("Gui");
		
		for(String fb: filaBanco) {
			System.out.println(fb);
		}
		
		System.out.println("");
		
		//diferenca do peek() pro element(). Quando a fila estiver vazia: element() = lan�a uma excecao. peek() = retorna null.
		
		System.out.println(filaBanco.peek()); //retorna o 1� elemento da fila
		System.out.println(filaBanco.element()); //retorna o 1� elemento da fila
	
		//diferenca do poll() pro remove(). Quando a fila estiver vazia: remove() = lan�a uma excecao. poll() = 
		
		System.out.println(filaBanco.poll()); //retorna o 1� elemento da fila e remove
		System.out.println(filaBanco.remove()); //retorna o 1� elemento da fila e remove
		System.out.println(filaBanco.poll()); //retorna o 1� elemento da fila e remove
		System.out.println(filaBanco.poll()); //retorna o 1� elemento da fila e remove
		System.out.println(filaBanco.poll()); //retorna o 1� elemento da fila e remove
		System.out.println(filaBanco.poll()); //retorna o 1� elemento da fila e remove
		System.out.println(filaBanco.poll()); //retorna o 1� elemento da fila e remove
		
		//fila.size()
		//fila.clear()
		//fila.isEmpty()
		//fila.contains(...)
	}
}