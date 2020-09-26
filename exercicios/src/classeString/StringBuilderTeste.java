package classeString;

public class StringBuilderTeste {

	public static void main(String[] args) {
		
		String s = "Uma frase comum";
		StringBuilder sb = new StringBuilder(16); //O valor do construtor é o tamanho do seu sb...Se deixar em branco, por default, será 16 caracteres!
		StringBuilder sb1 = new StringBuilder("1234");
		s.concat(" test");
		System.out.println(s); //ele nao vai imprimir o test, pq a String é imutavel, teria que criar uma nova String para receber essa nova String (com concat)
		//Já o sb é diferente, quando damos o append() (parecido com o concat()) ele vai usar a mesma sb que criamos (reutiliza a mesma String)!!
		
		sb.append("Uma frase comum");
		System.out.println(sb); //ele imprimi normalmente, pq ele tem o met toString()
		sb.append(" test");
		System.out.println(sb);
		//System.out.println(sb.reverse()); //troca a ordem da string (inverter)
		System.out.println(sb.delete(0,2)); //Mesma coisa do met subString() da classe String. (0,2) -> ele tira do 0 e até o 1!
		System.out.println(sb1.insert(2, "***")); //Inserir a partir da pos 2, contando do zero!
		
		//Dif de StringBuilder e StringBuffer: StringBuffer tem sincronismo (bom para Multithread) e o outro nao, so isso!!
	}
}