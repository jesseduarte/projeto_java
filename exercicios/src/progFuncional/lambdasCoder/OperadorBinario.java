package progFuncional.lambdasCoder;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {

	public static void main(String[] args) {
		
		//BINARY OPERATOR		(T,T) -> T (os dois do mesmo tipo)
		
		BinaryOperator<Double> media = (n1,n2) -> (n1 + n2)/2;
		
		System.out.println(media.apply(9.0, 7.0));
		
		BiFunction<Double, Double, String> resultado = (n1,n2) -> 
											(n1 + n2)/2 >= 6.0 ? "Aprovado" : "Reprovado";
											
		System.out.println(resultado.apply(7.0, 8.0));
		
		/*Outro modo:
		Function<Double, String> aprovOuReprov = valor -> valor >= 6.0 ? 
															"Aprovado" : "Reprovado";
		
		System.out.println(media.andThen(aprovOuReprov).apply(9.0, 7.0));
		*/
	}
}
