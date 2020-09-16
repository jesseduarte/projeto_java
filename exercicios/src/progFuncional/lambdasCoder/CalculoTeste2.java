package progFuncional.lambdasCoder;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		//Somando dois valores igual do metodo da interface, por�m usando uma interface funcional padrao do Java!
		//O <T> diz qual TIPO de parametro que quero usar!!

		BinaryOperator<Double> calc = (x,y) -> x + y; //Sobrescrevendo o met apply()!
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x,y) -> x * y;
		System.out.println(calc.apply(2.0,3.0));
		
		//Com isso, nao preciso criar varios metodos ou subclasses ou interfaces para
		//executar essa operacao de somar, multiplicar, etc. Nessa interface funcional,
		//consigo realizar qualquer operacao com dois operandos, que dai crio as lambdas
		//de acordo com as operacoes matematicas que eu quero!!!
		
		//O BinaryOperator<T> realiza operacoes com dois parametros do MESMO tipo!!
		//Posso fazer com ele tambem, pegar duas listas e retornar uma nova lista,
		//receber duas strings e concatenar elas, etc.
		
		
	}
}
