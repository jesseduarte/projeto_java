package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	
	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?"; //O Percentual(%) so passa quando passar o parametro!
		
		System.out.println("Informe o valor para a pesquisa: ");
		String valor = entrada.nextLine();
		
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		pstmt.setString(1, "%" + valor + "%");
		
		ResultSet rs = pstmt.executeQuery(); 
		
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
		
		entrada.close();
		pstmt.close();
		conexao.close();		
	}		
}