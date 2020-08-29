package oo.abstrato;

//Classe Abstrata:

//Pode ter metodos abstratos e concretos;
//Geralmente é superclasse, pq as subclasses irao especificar ela;
//Nao pode ser instanciada.

public abstract class Animal {
	
	public String respirar() {
		return "CO2";
	}
	
	public abstract String mover(); //É algo muito especifico de cada animal, logo abstrato!
}
