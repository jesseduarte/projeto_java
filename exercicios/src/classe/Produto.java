package classe;

public class Produto {
	
	protected String nome;
	protected Double preco;
	protected Double desconto;
	
	Produto() {
		
	}
		
	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}

	public Double precoComDesconto() {
		
		return preco * (1-desconto);	
	}
	
	public Double precoComDesconto(Double descontoGerente) {
		
		return preco * (1-desconto - descontoGerente);	
	}
	
}
