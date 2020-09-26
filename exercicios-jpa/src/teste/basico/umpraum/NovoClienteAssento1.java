package teste.basico.umpraum;

import dao.basico.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("8C");
		Cliente cliente = new Cliente("Bia", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluir(assento) //mesmo se alterarmos a ordem do assento pelo cliente,
			.incluir(cliente) //a transação resolve isso! Mas, se fosse fazer em
			.fecharT()		//transacoes dif, colocando o cliente primeiro que o assento
			.fechar();     	//daria erro!!!
		
	}
}