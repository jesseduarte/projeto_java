package datas.novaAPIJava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class DateTimeAPITest {

	public static void main(String[] args) {
	
		// System.out.println(new Date()); //Modo muito antigo
		// System.out.println(Calendar.getInstance()); //Modo antigo
		//Criado para trabalhar somente com datas!!
		LocalDate data = LocalDate.of(2019, Month.JANUARY, 25); //Modo NOVO!
		System.out.println(data);
		System.out.println(data.getDayOfMonth());
		System.out.println(data.getDayOfWeek());
		System.out.println(data.getMonth());
		System.out.println(data.getMonthValue());
		System.out.println(data.lengthOfMonth());
		System.out.println(data.getYear());
		System.out.println(data.isLeapYear()); //se é ano bissexto ou nao!
		LocalDate now = LocalDate.now();
		System.out.println(now);
		System.out.println(LocalDate.MAX); //data maxima do LocalDate
		
		//Para horario:
		System.out.println("-----------LocalTime-----------");
		LocalTime hora = LocalTime.of(23,2,15);
		System.out.println(hora);
		System.out.println(hora.getHour());
		System.out.println(hora.getMinute());
		System.out.println(hora.getSecond());
		System.out.println(LocalTime.MAX);
		
		//Para Data e Hora:
		System.out.println("-----------LocalDateTime-----------");
		LocalDateTime ldt1 = LocalDateTime.now();
		LocalDateTime ldt2 = LocalDateTime.of(2019, 01, 25, 8, 35, 26);
		LocalDateTime ldt3 = data.atTime(10, 20, 30); //estou dizendo que a hora do data do tipo LocalDate é essa 
		LocalDateTime ldt4 = data.atTime(LocalTime.now());
		System.out.println(ldt1);
		System.out.println(ldt2);
		System.out.println(ldt3);
		System.out.println(ldt4);
		//Parsing:
		System.out.println("----------Parsing--------");//Parser de data String para objeto Java!!
		LocalDate parseDate = LocalDate.parse("2019-01-25");
		LocalTime parseTime = LocalTime.parse("23:02:15");
		System.out.println(parseDate);
		System.out.println(parseTime);
	}
}
