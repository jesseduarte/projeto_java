package progFuncional.lambdasCoder;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		
		//Composicao de Predicates!!
		 Predicate<Integer> isPar = numero -> numero % 2 == 0;
		 Predicate<Integer> isTresDigitos = valor -> valor >= 100 && valor <= 999;
		 System.out.println(isPar.and(isTresDigitos).negate().test(200));
		 System.out.println(isPar.or(isTresDigitos).test(200));
	}
}