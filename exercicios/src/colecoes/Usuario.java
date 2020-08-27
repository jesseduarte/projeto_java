package colecoes;

//Classe usada pela classe Lista.java

public class Usuario {
	
	String nome;
	
	Usuario(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Meu nome é: " + this.nome;
	}

	//Isso foi gerado pelo Eclipse. Source > Generate Equals and HashCode
	//@Override
	//public int hashCode() {
	//		final int prime = 31;
	//int result = 1;
	//result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	//return result;
	//}
	
	//Outro modo de implementar o hashCode dando valor 1 para todos os elementos
	//@Override
	//public int hashCode() {
//		return 1;
	//}
	
	@Override
	public int hashCode() {
		return this.nome.length(); //Usa o tamanho do nome para ele usar como HashCode
	}							   //Ele vai restringir os nomes com tamanhos iguais

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}