package circ;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc c1 = new AreaCirc(2.0);
		AreaCirc c2 = new AreaCirc(3.0);
		
		System.out.println(c1.calcularArea());
		System.out.println(c2.calcularArea());
		System.out.println();
		System.out.println(c1.comprimentoCirc());
		System.out.println(c2.comprimentoCirc());
	}
}
