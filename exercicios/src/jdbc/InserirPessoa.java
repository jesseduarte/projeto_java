package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		String nome = entrada.nextLine();

		Connection conexao = FabricaConexao.getConexao();

//		String sql = "INSERT INTO pessoas (nome) VALUES ('" + nome + "')"; //NAO fazer isso, ('" + nome + "')" -> causa de SQL Injection
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(sql);
		 
		PreparedStatement stmt = conexao.prepareStatement(sql); //O PreparedStatement é mais seguro contra SQLInjection do que o Statement!!
		stmt.setString(1, nome); //coloca o indice 1 (pq so tem ele) e o valor do nome
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso!");
		entrada.close();		
	}
}