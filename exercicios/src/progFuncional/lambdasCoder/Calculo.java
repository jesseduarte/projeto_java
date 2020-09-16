package progFuncional.lambdasCoder;

@FunctionalInterface //nao � obrigatorio. Ele s� impede de vc declarar mais de um met abstrato na interface!
public interface Calculo {

	//Mostrando que posso ter metodos Default e estatico numa interface funcional!!
	
	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}
}
