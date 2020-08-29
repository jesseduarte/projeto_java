package oo.composicao;

import java.util.ArrayList;

//1 COMPRA pode ter varios ITENS. relacao 1:N

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	Compra(String cliente) {
		this.cliente = cliente;
	}
	
	double obterValortotal(){
		
		double total = 0;
		for(Item it: itens) {
			total += it.quantidade * it.preco;
		}
		return total;
	}
}
