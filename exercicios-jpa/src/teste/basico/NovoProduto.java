package teste.basico;

import dao.basico.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("Monitor 23", 789.98);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		//dao.abrirT().incluir(p).fecharT().fechar();
		dao.incluirAtomico(p).fechar();
		System.out.println("Id do produto: " + p.getId());
		
	}

}
