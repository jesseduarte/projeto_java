package IO.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\projeto_java\\exercicios\\src\\arquivo.txt");
		
		//PARA ARQUIVOS PEQUENOS:
		//OUTRO MODO DE FAZER (OTIMIZADO):
		
		//Usando o try-with-resources:
		//Ele � usado para fechar os recursos automaticamente sem precisar se preocupar com isso!
		//Nao precisa mais colocar o close() e nem fechar conexao no bloco finally{}!!
		try(FileWriter fw = new FileWriter(file);
			FileReader fr = new FileReader(file)) {
			fw.write("Escrevendo uma mensagem no arquivo.\nE pulando uma linha 1!!"); //Escreve no arquivo
			fw.flush(); //Escrevemos nesse tunel chamado Stream (sao varios bytes). a funcao flush() ela joga tudo dentro do Stream para o meu arquivo!!
			char[] in = new char[500]; //Array de char para ler o arquivo
			int size = fr.read(in); //Retorna a qtd de caracteres lidos. Para ler o arquivo, tem que colocar no array de Char!! 
			System.out.println(size);
			for(char c: in) {
				System.out.print(c); //Retorna os caracteres lidos!!
			}
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		/*
		try {
			//Escreve no arquivo:
			
			FileWriter fw = new FileWriter(file); //Criando o obj para escrever no arq, querendo sobrescrever nele. Se ja existir algo escrito, e vc escrever algo diferente no writer(), ele ir� sobrescrever o arquivo!
			//FileWriter fw = new FileWriter(file, true); //Criando o obj para escrever no arq, sem sobrescreve-lo e sim escrevendo no final do arquivo!!
			fw.write("Escrevendo uma mensagem no arquivo.\nE pulando uma linha 1!!"); //Escreve no arquivo
			fw.flush(); //Escrevemos nesse tunel chamado Stream (sao varios bytes). a funcao flush() ela joga tudo dentro do Stream para o meu arquivo!!
			fw.close();
			
			//Ler o arquivo:
			
			FileReader fr = new FileReader(file); //Criando o obj para ler o arquivo
			char[] in = new char[500]; //Array de char para ler o arquivo
			int size = fr.read(in); //Retorna a qtd de caracteres lidos. Para ler o arquivo, tem que colocar no array de Char!! 
			System.out.println(size);
			for(char c: in) {
				System.out.print(c); //Retorna os caracteres lidos!!
			}
			fr.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		*/
	}
}