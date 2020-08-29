package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {

	Ferrari(int velocidadeAtual) {
		super(velocidadeAtual);
	}

	@Override
	public void acelerar() {
		this.velocidadeAtual += 15;
	}
	
	@Override
	public void ligarTurbo() {
		this.velocidadeAtual += 50;
	}
	
	@Override
	public void desligarTurbo() {
		this.velocidadeAtual -= 30;
	}
}