package progFuncional.lambdasCoder;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
		
		//SUPPLIER 			 NADA -> T
		//Supplier<T> nao tem entrada, porém retorna algo.
		
		Supplier<List<String>> umLista = 
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
				
		Supplier<Double> numsAleatorios =
							() -> Math.random();
							
		System.out.println(numsAleatorios.get());
		System.out.println(umLista.get());
	}
}