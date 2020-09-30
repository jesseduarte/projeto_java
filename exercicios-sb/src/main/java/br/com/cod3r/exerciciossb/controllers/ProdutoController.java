package br.com.cod3r.exerciciossb.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired //o Spring irá criar um obj da classe ProdutoRepository na variavel!
	private ProdutoRepository produtoRepository;
	
	//O @ResponseBody diz que o objeto será retornado no corpo. Nao é necessário, mas
	//só confirma que será no corpo.
	
	//Como fazer que o metodo interaja com o ProdutoRepository?
	//Iremos utilizar a injecao de dependencia.
	//Metodo usando Bean Validation:
	@PostMapping
	public @ResponseBody Produto novoProduto(@Valid Produto prod) {
	
	//@Valid = o obj será instanciado só quando satisfizer a cond do Validation da
	//classe Produto.
		
	/*
	 Podemos substituir:(@RequestParam String nome,
						 @RequestParam double preco, 
						 @RequestParam double desconto, ...)
						 
			por (Produto prod)
	 */	
			
			produtoRepository.save(prod); //irá persistir o objeto no BD! Testando no POSTMAN, colocando os valores, ele ja joga direto no BD.
			return prod;
	}
}
//Podemos testar o mapeamento do POST do metodo novoProduto, usando o POSTMAN, da
//seguinte forma:

//Abrimos o POSTMAN;
//Vamos no campo dos metodos HTTP e setamos para POST;
//Inserimos na URL o endereço http://localhost:8080/api/produtos;
//Vamos na guia BODY e selecionamos o radio x-www-form-urlencoded;
//Irá abrir uma tabela de key e value. Na key, coloco o nome do parametro do metodo
//(nome). No value, insiro o valor de acordo com o tipo do parametro;
//Após isso, clicar em Send. Se der certo, irá retornar os dados via JSON!!!

/*
	Metodo sem usar Bean Validation:
	public @ResponseBody Produto novoProduto(Produto prod) {
	
			Predicate<Produto> precoMaiorZero = p -> p.getPreco() > 0.0;
			Predicate<Produto> descontoMaiorZero = p -> p.getDesconto() > 0.0;
			Predicate<Produto> descontoMenorUm = p -> p.getDesconto() < 1.0;
			
			Predicate<Produto> resultadoLogica = precoMaiorZero
												.and(descontoMaiorZero)
												.and(descontoMenorUm);
			
			if(resultadoLogica.test(prod)) {
				produtoRepository.save(prod); //irá persistir o objeto no BD! Testando no POSTMAN, colocando os valores, ele ja joga direto no BD.
			} else {
				System.out.println("Produto não inserido!");
			}
			return prod;
	}
	
*/