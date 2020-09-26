package generics;

import java.util.List;

public class ListaUtil {
	
	public static <T> T getUltimo(List<T> lista) { //Pegar o ultimo elemento de uma lista de qlq tipo T. Vai retornar um obj T do tipo T
		return lista.get(lista.size() - 1);
	}
}