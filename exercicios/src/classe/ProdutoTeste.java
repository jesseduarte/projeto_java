package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4300.67, 0.25);
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		Double precofinal1 = p1.precoComDesconto(0.2);
		Double precofinal2 = p2.precoComDesconto(); 
		Double total = precofinal1 + precofinal2;
		
		System.out.println(p1.nome);
		System.out.println("Pre�o total do Notebook: " + precofinal1);
		System.out.println(p2.nome);
		System.out.println("Pre�o total da Caneta: " + precofinal2);
		System.out.println("Total Carrinho: " + total);
		
	}

}
