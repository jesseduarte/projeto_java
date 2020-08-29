package oo.composicao;

public class CompraItemTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra("Jesse");
		
		compra1.itens.add(new Item("Caneta", 20, 7.45));
		compra1.itens.add(new Item("Borracha", 12, 3.89));
		compra1.itens.add(new Item("Caderno", 3, 18.79));
		
		for (int i = 0; i < compra1.itens.size(); i++) {
			System.out.println(compra1.itens.get(i).nome);
		}
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValortotal());
	}
}
