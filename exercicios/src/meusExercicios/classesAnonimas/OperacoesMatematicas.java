package meusExercicios.classesAnonimas;

class Operacao {
	
	public int soma(int a, int b) {
		return a + b;
	}
}

public class OperacoesMatematicas {

	public static void main(String[] args) {
		
		Operacao op = new Operacao() {
			public int soma(int a, int b) {
				return a + b + 1;
			}
		};
		
		System.out.println(op.soma(2, 3));
	}
}