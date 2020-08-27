package colecoes;

import java.util.HashSet;

//Usando a classe Usuario.java

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		
		//Se comentar o metodo HashCode e nao tiver nenhum outro, ele retorna false, pq nao achará apenas so usando o Equals.
		System.out.println(usuarios.contains(new Usuario("Guilherme")));
	}

}
