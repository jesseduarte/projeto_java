package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o codigo: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas where codigo = ?";
		
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		pstmt.setInt(1, codigo);
		
		if(pstmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com sucesso!");
		} else {
			System.out.println("Nada feito!");
		}
		
		entrada.close();
		pstmt.close();
		conexao.close();
	}
}