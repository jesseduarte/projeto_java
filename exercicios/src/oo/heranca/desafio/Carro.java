package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual;
	
	Carro(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public void acelerar() {
			this.velocidadeAtual += 5;
	}
	
	public void frear() {
		if(this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
		}else {
			this.velocidadeAtual = 0;
		}
	}
}