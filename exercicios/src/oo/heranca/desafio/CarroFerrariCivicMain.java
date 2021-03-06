package oo.heranca.desafio;

public class CarroFerrariCivicMain {
	
	public static void main(String[] args) {
		
		Carro car = new Carro(30);
		Ferrari fer = new Ferrari(100); //Mesma coisa: Carro fer = new Ferrari(...);
		Civic civ = new Civic(70);
		
		car.acelerar();
		fer.acelerar();
		civ.acelerar();
		
		System.out.println(car.velocidadeAtual);
		System.out.println(fer.velocidadeAtual);
		System.out.println(civ.velocidadeAtual);
		
		car.frear();
		fer.frear();
		civ.frear();
		
		car.frear();
		fer.frear();
		civ.frear();
		
		System.out.println(car.velocidadeAtual);
		System.out.println(fer.velocidadeAtual);
		System.out.println(civ.velocidadeAtual);
	}

}
