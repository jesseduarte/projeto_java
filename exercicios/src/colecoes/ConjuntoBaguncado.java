package colecoes;

import java.util.HashSet;
import java.util.Set;

//Usando o HashSet da interface SET.

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet(); //<nao coloco nada> = Sem restricoes, é um Object!
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println(conjunto.size());
		
		conjunto.add("Teste");
		
		System.out.println(conjunto.size()); //nao aceita repeticao
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		//conjunto.addAll(nums); //Uniao dos conjuntos
		conjunto.retainAll(nums); //Intersecao dos conjuntos
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}