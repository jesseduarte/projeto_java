package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost:3306/wm?useTimezone=true&serverTimezone=America/Sao_Paulo";
		final String usuario = "root";
		final String senha = "jes250192";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha); //realiza conexao com o banco
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE curso_java");
		
		System.out.println("Banco criado com sucesso!");
		conexao.close();
	}

}
