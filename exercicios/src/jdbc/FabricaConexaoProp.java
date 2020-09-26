package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexaoProp {
	
public static Connection getConexao() {
		
		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("banco.url");
			final String usuario = prop.getProperty("banco.usuario");
			final String senha = prop.getProperty("banco.senha");

			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			return conexao;
			
		} catch(SQLException | IOException e) {
			throw new RuntimeException(e);
		  }
	}
	
	//Classe Properties é usada para pegar esse arquivo e ler os valores.
		private static Properties getProperties() throws IOException {
			Properties prop = new Properties();
			String path = "conexao.properties";
			prop.load(FabricaConexaoProp.class.getClassLoader().getResourceAsStream(path));
			return prop;
		}
}