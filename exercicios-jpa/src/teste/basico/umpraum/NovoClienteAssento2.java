package teste.basico.umpraum;

import dao.basico.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("4D");
		Cliente cliente = new Cliente("Rodrigo", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		dao.incluirAtomico(cliente); //com o (cascade = CascadeType.PERSIST), ele persistiu os dois objetos, msm sem chamar o assento
	}
}