package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexaoProp.getConexao();
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE teste");
		
		System.out.println("Banco criado com sucesso!");
		conexao.close();
	}

}
