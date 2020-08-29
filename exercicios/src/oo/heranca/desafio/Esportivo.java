package oo.heranca.desafio;

//Uma classe pode herdar de varias interfaces.
//Por padrao, tds os metodos da interface sao publicos e abstratos (nao tem corpo)
//A classe que herdar dessa interface ter� obrigacao de implementar os metodos dela.

public interface Esportivo {

	void ligarTurbo(); //cada classe tem um jeito e maneira de ligar o turbo!Algo Especifico!
	void desligarTurbo();
	
	default int velocidadeDoAr() { //Metodo opcional, nao � obrigado implementar ele.
		return 1;
	}
}