package NIO.test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioTest {
	
	public static void main(String[] args) throws IOException {
		
		//Usamos a classe Paths para criar arquivos, que implementa a Interface Path!!
		//E operacoes nesses arquivos serão realizadas pela classe Files!!
		
		Path p1 = Paths.get("C:\\projeto_java\\exercicios\\src\\NIO\\test\\teste.txt");
		Path p3 = Paths.get("C:\\projeto_java\\exercicios\\src\\NIO\\test");
		Path p4 = Paths.get("C:\\projeto_java\\exercicios\\src\\NIO\\testeCopiado.txt");
		
		//if(Files.notExists(p1)) {
		//			Files.createFile(p1);
		//System.out.println("Arquivo criado!");
		//	} else {
		//System.out.println("Arquivo ja existe");
		//}
		
		//Path p2 = Paths.get("C:\\projeto_java\\exercicios\\src\\NIO\\arquivoCopiado.txt");
		//Files.copy(p1, p2);
	}
}