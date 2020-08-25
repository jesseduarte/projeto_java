package classe;

public class Produto {
	
	protected String nome;
	protected Double preco;
	protected Double desconto;
	
	public Double precoComDesconto() {
		
		return preco * (1-desconto);	
	}
	
	public Double precoComDesconto(Double descontoGerente) {
		
		return preco * (1-desconto - descontoGerente);	
	}
	
}
