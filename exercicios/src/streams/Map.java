package streams;

import java.util.Arrays;
import java.util.List;

public class Map {

	public static void main(String[] args) {
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		
		//o map() ele mapeia o stream anterior transforma em um novo stream processado!!
		marcas.stream().map(m -> m.toUpperCase()).forEach(Utilitarios.print);
		
		System.out.println("\nUsando composicao...");
		marcas.stream()
			.map(Utilitarios.maiusculo)
			.map(Utilitarios.primeiraLetra)
			.map(Utilitarios::grito)
			.forEach(Utilitarios.print);
	}
}