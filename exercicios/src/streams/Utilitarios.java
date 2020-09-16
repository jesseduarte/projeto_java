package streams;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

//Criei essa classe para armazenar as minhas expressoes Lambdas!!

public class Utilitarios {
	
	public final static Consumer<String> print = System.out::print;
	public final static UnaryOperator<String> maiusculo = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + ""; //Concatenei um caracter com uma string vazia que ira resultar numa string.		

	public final static String grito(String n) { //metodo normal
		return n + "!!!";
	} 
}