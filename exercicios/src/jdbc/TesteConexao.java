package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost/curso_java?useTimezone=true&serverTimezone=America/Sao_Paulo";
		final String usuario = "root";
		final String senha = "jes250192";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha); //realiza conexao com o banco
		System.out.println("Conexao realizada!");
		conexao.close();
	}
}