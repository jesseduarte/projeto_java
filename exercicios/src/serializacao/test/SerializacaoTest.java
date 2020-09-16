package serializacao.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializacaoTest {
	
	public static void main(String[] args) {
		gravadorObjeto();
		leitorObjeto();
	}

	private static void gravadorObjeto() { //Serializando!!
		Turma t = new Turma("Maratona Java");
		Aluno aluno = new Aluno(1L, "Jesse", "123456");
		aluno.setTurma(t);
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\projeto_java\\exercicios\\src\\aluno.ser"))) {
		//FileOutputStream fos = new FileOutputStream("C:\\projeto_java\\exercicios\\src\\aluno.ser");
		//ObjectOutputStream oos = new ObjectOutputStream(fos); //Como é uma serializacao de objetos, será Object... Salvando objetos num arquivo!!
		oos.writeObject(aluno);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void leitorObjeto() { //Deserializando!!
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\projeto_java\\exercicios\\src\\aluno.ser"))) {
		Aluno aluno = (Aluno) ois.readObject(); //retorna um objeto da classe Object, por isso que usei o Cast para converter em uma classe Aluno!
		System.out.println(aluno);
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
