package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto"); //Ele adiciona como tambem substitui
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		usuarios.put(4, "XXX");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet()); //retorna todos os indices das chaves
		System.out.println(usuarios.values()); //retorna todos os valores das chaves
		System.out.println(usuarios.entrySet()); //retorna todas as chaves com seus respect valores
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("Rafaela"));
		System.out.println(usuarios.get(2));
		System.out.println();
		
		//Percorrendo as chaves do MAP
		for(int k: usuarios.keySet()) {
			System.out.println(k);
		}
		//Percorrendo os valores do MAP
		for(String v: usuarios.values()) {
			System.out.println(v);
		}
		//Percorrendo as chaves e os valores do MAP
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			//System.out.println(registro); OU
			System.out.print(registro.getKey() + "==>");
			System.out.println(registro.getValue());
		}
	}
}