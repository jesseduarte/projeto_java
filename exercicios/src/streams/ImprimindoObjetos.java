package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		//1� MODO DE IMPRIMIR:
		System.out.println("Usando o Foreach...");
		for(String a: aprovados) {
			System.out.println(a);
		}
		
		//2� MODO DE IMPRIMIR:
		System.out.println("\nUsando o Iterator...");
		Iterator<String> it = aprovados.iterator(); //usa os metodos do Iterator<> na lista aprovados
		while(it.hasNext()) { //Enquanto existir proximo na lista, fa�a...
			System.out.println(it.next());
		}
		
		//3� MODO DE IMPRIMIR:
		System.out.println("\nUsando uma Stream...");
		Stream<String> st = aprovados.stream(); //inicializa a stream e usa os metodos stream na lista aprovador.
		st.forEach(System.out::println);
		//OU USANDO LAMBDA:
		//st.forEach(s -> System.out.println(s));
	}
}