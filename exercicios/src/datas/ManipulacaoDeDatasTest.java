package datas;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {

	public static void main(String[] args) {
		
		//Classe Date, classe antiga, os metodos maioria ficaram obsoletos!! Classe Calendar substituiu ela!
		//No Java 8, fizeram tambem a classe Time melhor que as classes Date e o Calendar!
		
		//Date date = new Date(1_000_000_000_000L); // se quiser em milissegundos
		Date dataAtual = new Date(); //deixando vazio, ele busca a data atual
		System.out.println(dataAtual); //tem o toString() implicito
		System.out.println(dataAtual.getTime()); //retorna a data atual em milissegundos
		
		//Verificamos acima que é bem ruim trabalhar com a classe Date!!
		
		//Vamos verificar o Calendar (classe abstrata):
		
		Calendar c = Calendar.getInstance(); //objeto c, do tipo Calendar, atribuido por um metodo static
		System.out.println(c);
		System.out.println(Calendar.SUNDAY); //retorna em int
		if(Calendar.SUNDAY == c.getFirstDayOfWeek()) {
			System.out.println("Domingo é o primeiro dia da semana");
		}
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		//Adicionar horas, datas:
		Calendar c1 = Calendar.getInstance();
		c1.add(Calendar.HOUR, 2); //escolho onde quero adicionar e a quantidade!!
		c1.add(Calendar.MONTH, 3);
		Date date1 = c1.getTime(); //retorna um objeto Date representando um valor Calendar
		System.out.println(date1);
		
		
	}
}
