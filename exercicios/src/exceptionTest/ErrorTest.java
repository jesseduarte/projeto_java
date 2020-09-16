package exceptionTest;

public class ErrorTest {
	
	public static void main(String[] args) {
		stackOverFlowError();
	}
	public static void stackOverFlowError() {
		stackOverFlowError(); //gerará um erro, pq ele vai ser chamado toda hora. Erro de empilhamento da memoria!!
	}
}
