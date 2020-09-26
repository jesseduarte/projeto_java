package meusExercicios.colecoes.lista;

import java.util.Scanner;

public class Exercicios1Test {
	
	public static void main(String[] args) {
		
		Exercicios1.adicionarLista(new Exercicios1(1,"Jesse"));
		Exercicios1.adicionarLista(new Exercicios1(2,"Isabele"));
		Exercicios1.adicionarLista(new Exercicios1(3,"Patricia"));
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o id: ");
		int id = entrada.nextInt();
		System.out.println("Entre com o nome: ");
		String nome = entrada.next();
		
		Exercicios1.adicionarLista(new Exercicios1(id, nome));
		
		Exercicios1.getListaAll();
		
		System.out.println("");
		
		Exercicios1 print = Exercicios1.getListaById(1);
		System.out.println(print);
		
		entrada.close();
	}
}