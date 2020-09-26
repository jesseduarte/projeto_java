package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

	public static void main(String[] args) throws SQLException{
		
		Connection conexao = FabricaConexaoProp.getConexao();
		String sql = "SELECT * FROM pessoas";
		
		Statement stmt = conexao.createStatement();
		ResultSet rs = stmt.executeQuery(sql); //como quero retornar um valor do banco (select) nao uso o execute() e sim o executeQuery()!!
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		//Como vou receber multiplas linhas, logo jogarei ele no while:
		while(rs.next()) {
			int codigo = rs.getInt("codigo");
			String nome = rs.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + "------" + p.getNome());
		}
		
		conexao.close();		
	}
}