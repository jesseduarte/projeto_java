package meusExercicios.colecoes.lista;

import java.util.ArrayList;
import java.util.List;

public class Exercicios1 {

	int id;
	String nome;
	static List<Exercicios1> lista = new ArrayList<>();
	
	public Exercicios1(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public static void adicionarLista(Exercicios1 obj) {
		Exercicios1.lista.add(obj);
	}
	
	public static Exercicios1 getListaById(int i) {
		return Exercicios1.lista.get(i);
	}
	
	public static void getListaAll() {
		for(Exercicios1 o: lista) {
			System.out.println(o);
		}
	}
	
	public String toString() {
		return "ID: " + id + " ------ " + "Nome: " + nome;
	}
}