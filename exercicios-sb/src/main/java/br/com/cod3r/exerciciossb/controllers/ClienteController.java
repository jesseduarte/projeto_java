package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Cliente;

//Essa classe é um controller para exibir na URL os metódos da classe Model Cliente!

@RestController
@RequestMapping("/clientes") //Mapeando a classe como "/clientes"
public class ClienteController {
	
	@GetMapping("/qualquer") //Nao precisa colocar o "/clientes" pq já é o raiz desse metodo!
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00"); //Ele retornou no formato JSON! Converteu o obj no formato JSON!
	}
	
	//quero colocar a URL: http://localhost:8080/clientes/(id). Para isso, devemos
	//colocar a var id no @GetMapping e depois inserir, junto do param do metodo,
	//a anotacao @PathVariable
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.654.321-00");
	}
	
	//MODO MAIS USADO:
	//quero colocar a URL: http://localhost:8080/clientes?id=(id). Para isso, devemos
	//inserir a anotação @RequestParam no param do metodo e colocar o atributo name.
	//Se quiser podemos inserir mais atributos como: defaultValue e o required.
	
	@GetMapping
	public Cliente obterClientePorId2(
									@RequestParam(name = "id") int id) {
		return new Cliente(id, "João Augusto", "111.222.333-44");
	}
}