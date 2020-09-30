package progFuncional.lambdasCoder;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		//FUNCTION			    S -> T (os dois de tipos diferentes)
		//Funcao<T, R> tem entrada um tipo qlq e retorna um tipo qlq!!
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";
				
		System.out.println(parOuImpar.apply(30));
		
		Function<String, String> oResultadoE =
				valor -> "O resultado é: " + valor;
				
		Function<String, String> empolgado =
				valor -> valor + "!!!";
				
		//Composicao de funcoes:
		//Para composicao de funcoes, a saida de uma irá ser a entrada de outra!!
		// a funcao andThen() coloca outra funcao para compor tambem a variavel!!

		String resultadoFinal = parOuImpar
										  .andThen(oResultadoE)
										  .andThen(empolgado)
										  .apply(30);

		System.out.println(resultadoFinal);
	}
}