package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 3500.00, 0.3, 0.0);
		Produto p2 = new Produto("Geladeira", 2200.00, 0.4, 10.0);
		Produto p3 = new Produto("Fogao", 1000.00, 0.35, 0.0);
		Produto p4 = new Produto("Cama", 1500.00, 0.1, 20.00);
		Produto p5 = new Produto("Armario", 1000.00, 0.32, 0.0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		Predicate<Produto> descMaior30 = p -> p.desconto >= 0.3;
		Predicate<Produto> freteGratis = p -> p.frete == 0.0;
		Function<Produto, String> exibirProdutos = p -> 
								p.nome + " custando " + p.preco + "(SUPER PROMOCAO)";
		
		produtos.stream()
			.filter(descMaior30)
			.filter(freteGratis)
			.map(exibirProdutos)
			.forEach(System.out::println);												
	}
}