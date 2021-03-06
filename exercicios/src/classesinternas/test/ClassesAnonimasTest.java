package classesinternas.test;

class Animal {
	public void andar() {
		System.out.println("Andando");
	}
}

public class ClassesAnonimasTest {
	
	public static void main(String[] args) {
		
		//Imagina que precisamos mudar o comportamento do metodo andar() da classe Animal.
		//tipo, andar rapido. Nao queremos criar uma subclasse que sobrescreve o metodo
		//criado. Para fazer isso, precisamos criar uma classe anonima.

		//Classe anonima: uma classe que � definida em det momento do codigo, onde nao
		//vai ter nome, ela simplesmente vai deixar de existir depois que utilizamos.
		
//var de referencia = objeto concreto sem nome 
		   Animal a = new Animal() { //criando a classe anonima
			     public void andar() { //sobrescrevendo o met que quero modificar
				    System.out.println("Andando anonimamente");
			     }
		   };
		a.andar();
		
		Animal b = new Animal();
		b.andar();
	}
}

/*
	 Outro exemplo de classe anonima:
	 
	 Collections.sort(carroList, new Comparator<Carro>() { Comparator � uma interface
	 	@Override
	 	public int compare(Carro c1, Carro c2) {
	 		return c1.getNome().compareTo(c2.getNome());
	 	}
	 }
*/