package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 System.out.println("Digite o nome do aluno: ");
		 String nome = scan.next();
		System.out.println("Quantas notas voce quer informar: ");
		int quantidade = scan.nextInt();
		
		double[] notas = new double[quantidade];
		
		double total = 0;
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println("Digite sua nota " + (i+1) + ": ");
			notas[i] = scan.nextDouble();
			total += notas[i];
		}
		scan.close();
		double media = (total/quantidade);
		System.out.println("Suas notas foram: " + Arrays.toString(notas));
		System.out.println();
		System.out.println("A m�dia do " + nome + " � " + media);
	}
}