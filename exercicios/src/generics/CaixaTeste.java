package generics;

//Resolvendo o tipo <X> a partir da instanciacao dos objetos!!

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>(); //usando a classe Caixa, disse que meu obj será do TIPO String!!
		caixaA.guardar("Segredo!");
		System.out.println(caixaA.abrir());
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(3.1415);
		System.out.println(caixaB.abrir());
		
	}
}
