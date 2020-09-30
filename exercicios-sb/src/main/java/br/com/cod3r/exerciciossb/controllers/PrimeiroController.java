package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//NOSSO PRIMEIRO WEB SERVICE!!

@RestController //anotar a classe como um controlador REST!
public class PrimeiroController {
	
//Do mesmo jeito que o JPA mapeia objetos para o BD, iremos usar as annotations para
//mapear classes e seus metodos para mapear para URLs!!

	//@RequestMapping(method = RequestMethod.GET)
	
	//Estou dizendo que quero mapear uma requisicao para esse metodo!
	//Por padrao, ele já irá realizar uma req GET. Porém, se quiser explicitar isso,
	//Podemos usar o param "method = RequestMethod.GET".
	
	//@RequestMapping(method = RequestMethod.GET, path = "/")

	//Quanto a URL, se omitirmos o param "path" da annotation RequestMapping, por
	//convencao, ele apontará para o "http://localhost:8080/". Se colocarmos no
	//path o valor "/" será a mesma coisa de não colocar nada no path!!
	
	//Para nao precisarmos de colocar "method = RequestMethod.GET", podemos usar
	//outra anotação chamada @GetMapping!!
	
	//Podemos colocar tb um array de Strings URLs:
	//@GetMapping(path = {"/ola", "/saudacao"}) -> ele irá o msm metodo para as duas
	
	//OBS: podemos mapear dois métodos HTTP diferentes para mesma URL!!
	
	@GetMapping(path = "/ola")
	public String ola() {
		return "Olá Spring Boot!!";
	}
}