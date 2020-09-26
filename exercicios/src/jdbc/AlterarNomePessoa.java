package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

	public static void main(String[] args) throws SQLException {
		
		//Exibindo o nome antigo:
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o ID: "); 
		int id = entrada.nextInt();
		entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE codigo = ?";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Pessoa p = new Pessoa(rs.getInt("codigo"), rs.getString("nome"));
			System.out.println("");
			System.out.println("Nome antigo:");
			System.out.println(p.getCodigo() + "----" + p.getNome());
		}
		
		System.out.println("");
		pstmt.close();
		
		//Alterando o nome:
		
		System.out.println("Digite um novo nome: ");
		String novoNome = entrada.nextLine();
		
		sql = "UPDATE pessoas SET nome = ? where codigo = ?";
		pstmt = conexao.prepareStatement(sql);
		pstmt.setString(1, novoNome);
		pstmt.setInt(2, id);
		pstmt.execute();
		pstmt.close();
		
		//Exibindo o novo nome:
		
		sql = "SELECT * FROM pessoas WHERE codigo = ?";
		pstmt = conexao.prepareStatement(sql);
		pstmt.setInt(1, id);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Pessoa p = new Pessoa(rs.getInt("codigo"), rs.getString("nome"));
			System.out.println("");
			System.out.println("Nome novo:");
			System.out.println(p.getCodigo() + "----" + p.getNome());
		}
		
		pstmt.close();
		conexao.close();
		entrada.close();
	}
}