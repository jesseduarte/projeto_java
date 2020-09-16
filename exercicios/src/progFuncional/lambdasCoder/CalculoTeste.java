package progFuncional.lambdasCoder;

//interfaces funcionais do java fica no pacote java.util.function!!

public class CalculoTeste {

	public static void main(String[] args) {
		
		Calculo soma = (a,b) -> a + b;
		System.out.println(soma.executar(2, 3));
		
		System.out.println(soma.legal());
		System.out.println(Calculo.muitoLegal());
	}
}
