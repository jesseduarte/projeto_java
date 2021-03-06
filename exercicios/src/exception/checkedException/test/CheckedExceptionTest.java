package exception.checkedException.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
	
	public static void main(String[] args) {
		
		try {
			criarArquivo();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//Melhor maneira para excecoes CHECKEDs:
	public static void criarArquivo() throws IOException{ //agora a responsabilidade de tratar a excecao � do metodo main, pq eu acho esse metodo nele!!!

		//IOException � uma classe que � checked (que deve ser tratada, nao compila senao tratar!)
		File file = new File("X:/projeto_java/exercicios/src/teste.txt");
		System.out.println("Arquivo criado: " + file.createNewFile());
		System.out.println("Arquivo criado");
	}
	
	public static void abrirArquivo() {

		try {
			System.out.println("Abrindo um arquivo");
			System.out.println("Executando a leitura do arquivo");
			System.out.println("Escrevendo no arquivo");
		} catch(Exception e) {
			e.printStackTrace();
		} finally { //Sempre ser� executado, independentemente se cair no try ou catch!!
			System.out.println("Fechar o arquivo"); //sempre colocar a liberacao dos recursos aqui!! At� pra BD!!
		}
	}
}

/* Exercicio anterior:
public static void criarArquivo() {
		//IOException � uma classe que � checked (que deve ser tratada, nao compila senao tratar!)
		File file = new File("C:/projeto_java/exercicios/src/teste.txt");
		
		try{
			System.out.println("Arquivo criado: " + file.createNewFile());
			System.out.println("Arquivo criado");
		} catch(IOException e) { // e � um objeto do tipo IOException
			e.printStackTrace(); //retorna uma pilha de m�todos da exception
		}
	}
*/