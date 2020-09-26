package IO.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\projeto_java\\exercicios\\src\\teste.txt"); //Nao criou nada, pq aqui so estou criando um objeto do tipo File!!
			System.out.println(file.createNewFile()); //cria o arquivo
			//System.out.println(file.exists()); //saber se o arquivo existe
			System.out.println(file.canRead()); //Se o arquivo tem permissao de ler
			System.out.println(file.getPath()); //Ver o caminho do arquivo
			System.out.println(file.isDirectory()); //Ver se o arquivo � um diretorio
			System.out.println(file.isHidden()); //Ver se � um arquivo oculto
			System.out.println(new Date(file.lastModified())); //Ultima modif do arquivo. OBS: tempo em milissegundos! Colocando o new Date() retornar� uma data completa
			LocalDateTime ldt = LocalDateTime.ofInstant(Instant.ofEpochMilli(file.lastModified()), ZoneId.systemDefault());
			System.out.println(ldt);
			System.out.println(file.lastModified());
			boolean exists = file.exists();
			if(exists) {
				System.out.println(file.delete()); //deleta o arquivo
			} else {
				///System.out.println(file.createNewFile());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}