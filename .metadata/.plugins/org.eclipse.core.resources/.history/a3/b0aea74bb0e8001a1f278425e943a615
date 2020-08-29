package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantas notas você quer informar?");
		int quantidade = scan.nextInt();
		
		double[] notas = new double[quantidade];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + ": ");
			notas[i] = scan.nextDouble();
		}
		
		double total = 0;
		for (double nota: notas) {
			total += nota;
		}
		
		System.out.println("A média é: " + total/quantidade);		
	}
}