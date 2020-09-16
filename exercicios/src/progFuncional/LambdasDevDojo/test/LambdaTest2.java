package progFuncional.LambdasDevDojo.test;

import java.util.List;
import java.util.function.Consumer;
import static java.util.Arrays.asList;

public class LambdaTest2 {

	public static void main(String[] args) {
		
		//Interface Consumer<T> metodo accept(T t) = uso quando quero acessar o objeto t da classe T.
		
		//metodo asList cria uma lista imutavel!!
		//Ex: lista mutavel: List lista1 = new ArrayList<>();
		//Ex: lista imutavel: List lista = Arrays.asList(conta1,conta2); conta1 e conta2 sao elementos da lista
		//										como sao STRINGS, entao eu uso o Lambda no objeto c do tipo Consumer
		imprimirLista(asList("Jesse", "Duarte"), (String s) -> System.out.println(s));
		
	}
	
	//exemplo: criar um metodo que imprima todos os valores de uma lista.
	public static <T> void imprimirLista(List<T> lista, Consumer<T> c) { // o <T> diz que nao sei que lista �, so sei que ser� qlq lista
		for(T e: lista) {
			c.accept(e);
		}
	}
}