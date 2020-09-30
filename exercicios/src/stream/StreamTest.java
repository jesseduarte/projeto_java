package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest {

	//Stream é um fluxo de dados (bytes) Ex: executar um video no youtube, ouvir 
	//musica no Spotify
	
	//Temos duas classes principais:
	
	//InputStream = leitura de bytes (dados). Ex: fazer leitura de um arquivo 
	//(FileInputStream).
	
	//OutputStream = escrita de bytes (dados). Ex: escrita de um arquivo 
	//(FileOutputStream).
	
	public static void main(String[] args) {
		leitor();
	}
	
	//Estamos escrevendo bytes dentro de um arquivo txt (BYTES -> FILE)
	private static void gravador() {
		byte[] dados = {65,66,67,68,69,70};
		
		/*Diferença entre FileInputStream, FileReader e BufferedReader:
		 * 
		 * FileInputStream = lê arquivos em forma de stream.
		 * FileReader = le arquivos em modo caracter. Ou seja, le arquivos que estejam gravados no modo texto.
		 * BufferedReader = ler o arquivo em partes e manter trechos na memória, é possível ler linhas inteiras mais facilmente.
		 */
		
		try(FileOutputStream gravador = new FileOutputStream("C:\\projeto_java\\exercicios\\src\\stream.txt")) { //Estou instanciando o arquivo.
			gravador.write(dados);
			System.out.println("Dados gravados com sucesso");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void leitor() {
		try(FileInputStream leitor = new FileInputStream("C:\\projeto_java\\exercicios\\src\\stream.txt")) {
			int leitura;
			while((leitura = leitor.read()) != -1) {
				byte b = (byte) leitura;
				System.out.println(b);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
}