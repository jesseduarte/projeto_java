package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); //ir� converter de double -> Double
		
		//Integer coisa = (Integer) caixaA.abrir(); //Colocando um Object dentro de um Integer (erro)
		//System.out.println(coisa); //lan�ou excecao nao conseguiu fazer o cast
		
		Double coisa = (Double) caixaA.abrir(); //Tem que fazer o cast!
		System.out.println(coisa); //Funciona!!
	}
}
