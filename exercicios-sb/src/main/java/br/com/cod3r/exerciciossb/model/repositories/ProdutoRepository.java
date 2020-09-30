package br.com.cod3r.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.cod3r.exerciciossb.model.entities.Produto;

//Interface usada para abstrair todos acessos aos dados. Parecido com o DAO,
//com diferenças:
//o DAO foca na implementacao de acesso aos dados.
//o Repository define a interface de como iremos abstrair os dados.

//CrudRepository = interface que gera operacoes CRUD generico.
//CrudRepository<nome da classe q quero persistir, o tipo do id do Produto q queremos gerenciar>

public interface ProdutoRepository 
						extends CrudRepository<Produto, Integer>{	
}