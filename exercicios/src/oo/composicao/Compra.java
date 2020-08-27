package oo.composicao;

import java.util.ArrayList;

//1 COMPRA pode ter varios ITENS. relacao 1:N

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	Compra(String cliente) {
		this.cliente = cliente;
	}
	
	double obterValorTotal() {
		
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
}
