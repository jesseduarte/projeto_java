package classeString;

public class StringPerformanceTeste {

	//Classe que calcula quantos milisegundos o processador constroi tantas Strings,
	//num intervalo de tempo
	
	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis(); //tempo atual em milisegundos
		concatString(30000);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo gasto: " + (fim-inicio) + "ms");
		
		inicio = System.currentTimeMillis(); //tempo atual em milisegundos
		concatStringBuilder(30000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto: " + (fim-inicio) + "ms");
		
		inicio = System.currentTimeMillis(); //tempo atual em milisegundos
		concatStringBuffer(30000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto: " + (fim-inicio) + "ms");
		
		concatNomeStringBuilder("Duarte");
	}
	
	//Met estatico (de classe) = será padrao para todos, porém pode ser sobrescrito.
	public static void concatString(int tam) {
		String string = "";
		for (int i = 0; i < tam; i++) {
			string += i;
		}
	}
	
	/*Diferença entre StringBuilder e StringBuffer:
	
		StringBuilder é usado em sistemas monothread, nao se preocupa em isolar os valores.
		StringBuffer é usado em sistemas multithread, isola os valores e SINCRONIZA-OS.
		StringBuilder é mais rápido que o StringBuffer.
	*/
	
	public static void concatStringBuilder(int tam) { //método para alterar ou modificar o conteúdo interno, sem que necessariamente um novo objeto seja criado. Muito rapido! É uma String tipo um ArrayList!
		StringBuilder sb = new StringBuilder(tam); //o "tam" é o valor inicial
		for (int i = 0; i < tam; i++) {
			sb.append(i); //a funcao append() irá concatenar as novas Strings no obj sb.
		}
	}
	
	public static void concatStringBuffer(int tam) {
		StringBuffer sb = new StringBuffer(tam); //o "tam" é o valor inicial
		for (int i = 0; i < tam; i++) {
			sb.append(i); //a funcao append() irá concatenar as novas Strings no obj sb.
		}
	}
	public static void concatNomeStringBuilder(String nome) {
		StringBuilder nomeCompleto = new StringBuilder("Jesse ");
		nomeCompleto.append(nome);
		System.out.println(nomeCompleto);
	}
}