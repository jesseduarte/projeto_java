package generics;

//Exercicio usando Generics
//Usar Generics evita problemas de Casts!!

//classe generica<X> diz que tenho uma classe generica que vai armazenar alguma coisa de
//um tipo X. Quando formos realizar operações na classe que iremos determinar esse
//tipo X.

public class Caixa<X> {
	
	private X coisa;
	
	public void guardar(X coisa) {
		this.coisa = coisa;
	}
	
	public X abrir() {
		return coisa;
	}
}
