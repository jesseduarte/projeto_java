package dao.basico;

import modelo.basico.Produto;

//Resolvendo o generics DAO para a classe Produto!
//Estou falando que essa classe especificamente vai trabalhar com Produto!
//Pode colocar aqui atributos e metodos que sao especificos de produto.
//Ex: aplicar desconto para todos os produtos!

public class ProdutoDAO extends DAO<Produto> {

	public ProdutoDAO () {
		super(Produto.class);
	}
}
