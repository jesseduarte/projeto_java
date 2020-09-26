package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Bia"));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		System.out.println("");
		
		System.out.println(lista.get(3));
		
		lista.remove(1);
		lista.remove(new Usuario("Manu"));
		
		for(Usuario u: lista) {
			System.out.println(u.nome); //A ordem de inserc foi mantida!
		}
	}
}