package IO.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	public static void main(String[] args) {
		
		//MAIS PERFORMANCE:
		
		File file = new File("C:\\projeto_java\\exercicios\\src\\arquivo.txt");
		
		//OUTRO MODO DE FAZER (OTIMIZADO):
		
		//Usando o try-with-resources:
		//Ele � usado para fechar os recursos automaticamente sem precisar se preocupar com isso!
		//Nao precisa mais colocar o close() e nem fechar conexao no bloco finally{}!!
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			bw.write("Escrevendo uma mensagem no arquivo."); //Escreve no arquivo
			bw.newLine(); //Pula linha
			bw.write("E pulando uma linha");
			bw.flush(); //Escrevemos nesse tunel chamado Stream (sao varios bytes). a funcao flush() ela joga tudo dentro do Stream para o meu arquivo!!
			String s;
			//O metodo readLine() quando termina, ele retorna nulo, entao criamos esse while()			
			while((s=br.readLine()) != null) { 
				System.out.println(s);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		/*
		try {
			//Escreve no arquivo:
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Escrevendo uma mensagem no arquivo."); //Escreve no arquivo
			bw.newLine(); //Pula linha
			bw.write("E pulando uma linha");
			bw.flush(); //Escrevemos nesse tunel chamado Stream (sao varios bytes). a funcao flush() ela joga tudo dentro do Stream para o meu arquivo!!
			bw.close();
			
			//Ler o arquivo:
			
			FileReader fr = new FileReader(file); //Criando o obj para ler o arquivo
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			//O metodo readLine() quando termina, ele retorna nulo, entao criamos esse while()			
			while((s=br.readLine()) != null) { 
				System.out.println(s);
			}
			br.close(); //fechando o "br" ele ja fecha o mais interno, o "fr"
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		*/
	}
}
