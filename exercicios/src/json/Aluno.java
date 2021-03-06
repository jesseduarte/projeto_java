package json;

import java.sql.Timestamp;

import org.json.JSONObject;

public class Aluno {

	private String matricula;
	private String nome;
	private Timestamp nascimento;
	private int idade;
	
	public Aluno() {}
	
	public Aluno(JSONObject json) {  //Construtor do JSON. Converte JSON para OBJETO!
		this.matricula = json.getString("matricula");
		this.nome = json.getString("nome");
		this.nascimento = (Timestamp) json.get("nascimento");
		this.idade = json.getInt("idade");
	}

	public JSONObject toJson() { //Converte OBJETO para JSON!
		
		//Forma mais manual de fazer:
		//String json = "{matricula:'"+this.matricula+"',nome:'"+this.nome+"',nascimento:'"+this.nascimento+"',idade:'"+this.idade+"'}";
		//return json;
		
		//Forma melhor:
		org.json.JSONObject json = new JSONObject();
		json.put("matricula",this.matricula); //insere um atributo no JSON
		json.put("nome",this.nome);
		json.put("nascimento",this.nascimento);
		json.put("idade",this.idade);
		
		return json;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Timestamp getNascimento() {
		return nascimento;
	}
	public void setNascimento(Timestamp nascimento) {
		this.nascimento = nascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}