package exception.runtimeexception.test;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		
		//Esse tratamento que fazemos para classes UNchecked exception!!
		try {
			divisao(10,0);
		}catch(RuntimeException e) {
			System.out.println(e.getMessage()); //pega a mensagem do Illegal e exibe!!
			e.printStackTrace();
		}
	}
	
	private static void divisao(int num1, int num2) {
		if(num2 == 0) {
			throw new IllegalArgumentException("Passe um numero diferente de zero!");
		}
		int result = num1/num2;
		System.out.println(result);
	}
}

/* Exemplo anterior:
//Exceptions Uncheckeds (nao checadas, pq ja existe excecao criada para elas)!!
		
		//AritmethicException (divisao por zero):
		//modo de resolver:
		int a = 10;
		int b = 0;
		if(b != 0) {
			int c = a/b;
			System.out.println(c);
		}
		
		//NullPointerException:
		//Object o = null; //objeto nao inicializado tentando acessar um metodo!!
		//System.out.println(o.toString());
		
		//ArrayIndexOutOfBoundException:
		try {
			int [] ar = new int[2]; 
			System.out.println(ar[2]); //indice impresso esta fora do array!!
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
*/