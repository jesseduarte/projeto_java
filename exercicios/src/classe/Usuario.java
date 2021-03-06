package classe;

//CAPITULO SOBRE EQUALS E HASHCODE!

public class Usuario {

	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto; //criou um obj do tipo Usuario que recebe o objeto do tipo Object convertido para Usuario.
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.nome.length();
	}
	/* OBS: tem como gerar no Source o Equals e Hashcode para comparar objetos, ele j�
	monta o algoritmo pronto, s� usar. */
}