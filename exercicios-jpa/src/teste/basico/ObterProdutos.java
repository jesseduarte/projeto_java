package teste.basico;

import java.util.List;

import dao.basico.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {
	
	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO(); //nao precisa resolver o Generics, pq foi ja resolvido na classe ProdutoDAO.
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto p: produtos) {
			System.out.println("ID: " + p.getId() + " ----- " + "Nome: " 
						+ p.getNome());
		}
		
		double precoTotal = produtos
								.stream()
								.map(p -> p.getPreco())
								.reduce(0.0, (t,p) -> t + p) //t total p precoTotal
								.doubleValue();
		
		System.out.println("O valor total é R$ " + precoTotal);
		
		dao.fechar();
		
	}
}