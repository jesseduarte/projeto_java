package progFuncional.lambdasCoder;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		//PREDICATE		 	    T -> boolean
		//Predicate<T> entrada dele � qlq tipo e a saida retorna um booleano!
		
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		Produto p = new Produto("Notebook", 3890.90, 0.85);
		System.out.println(isCaro.test(p));
	}
}
