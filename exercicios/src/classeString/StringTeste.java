package classeString;

public class StringTeste {
	
	public static void main(String[] args) {
		
		String nome = "Jesse";
		//String sobrenome = new String(" Duarte"); outro modo de criar String
		
		System.out.println(nome.concat(" Duarte"));
		
		String teste = "Goku";
		String teste2 = "goku";
		System.out.println(teste.charAt(2)); //qual caracter pertence ao indice!
		System.out.println(teste.equalsIgnoreCase(teste2)); //Compara ignorando minusculo de maiusculo
		System.out.println(teste.length());
		System.out.println(teste.replace('o', 'e'));
		System.out.println(nome.replace('e', 'o'));
		//toLowerCase();
		//toUpperCase();
		System.out.println(nome.substring(1)); //ele retorna do 1 em diante!!
		System.out.println(nome.substring(1, 4)); //Ele retorna do 1 e vai até o 3!!
		String teste3 = "  espaco  aa";
		System.out.println(teste3);
		System.out.println(teste3.trim()); //Muito utilizado qd mexe com o BD, pede pro usuario digitar sem os espacos e ele digita com	
	}
}