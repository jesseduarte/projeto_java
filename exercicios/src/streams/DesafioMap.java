package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*Criar maps:
 * 1. Numero para string binaria... 6 => "110"
 * 2. Inverter a string... "110" => "011"
 * 3. Converter de volta para inteiro => "011" => 3
 */

public class DesafioMap {
	
	//Se tiver uma funcao pronta (Ex: println, toBinaryString,etc.), nao precisa criar
	//expressoes lambdas!! So criar expressoes lambdas para funcoes nao prontas!!

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		UnaryOperator<String> inversao = 
				s -> new StringBuilder(s).reverse().toString(); //toString() foi para converter o StringBuilder para String!

		Function<String, Integer> conversaoInteiro = s -> Integer.parseInt(s, 2);
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inversao)
			.map(conversaoInteiro)
			.forEach(System.out::println);
	}
}