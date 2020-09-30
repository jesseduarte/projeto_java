package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

// Reduce ele � tipo um for acumulador, vai somando cada elemento!!

public class Reduce1 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		//O reduce() � um Optional(estrutura), quer dizer que se nao tiver nada pra
		//acumular na lista ir� retornar null!!
		
		//Por isso que colocamos a variavel do tipo Integer e nao int, porque o tipo int
		//nao consegue receber null!!
	
		Integer total1 = nums.stream().reduce(soma).get(); //Quando nao tem valor inicial, colocar o get()
		System.out.println(total1);
		
		Integer total2 = nums.stream().reduce(100, soma); //reduce(100,soma) o 100 � um valor inicial que ir� somar com a lambda soma (usando stream())
		System.out.println(total2);
	
		Integer total3 = nums.parallelStream().reduce(100, soma); //reduce(100,soma) o 100 � um valor inicial que ir� somar cada elemento da lambda soma e depois somar todos juntos (usando parallelStream())
		System.out.println(total3);
		
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println); //s� ir� exibir, se estiver presente.
	}
}