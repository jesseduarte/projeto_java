package progFuncional.lambdasCoder;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional...");
		for(String a: aprovados) {
			System.out.println(a);
		}
		
		System.out.println("\nLambda v 1.0");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod Reference...");
		aprovados.forEach(System.out::println); //estou usando a referencia de um metodo para realizar a acao de outro metodo!!
		
		System.out.println("\nLambda v 2.0");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference...");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}