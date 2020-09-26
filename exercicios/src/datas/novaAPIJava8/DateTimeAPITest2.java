package datas.novaAPIJava8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateTimeAPITest2 {
	
	public static void main(String[] args) {
		
		LocalDateTime dt1 = LocalDateTime.now();
		LocalDateTime dt2 = LocalDateTime.of(2020, Month.SEPTEMBER, 20, 23,0,0);
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.of(5,0,0);
		
		//Duration:
		//� usado para segundos e nanosegundos
		//nao pode usar LocalDate
		//nao pode misturar LocalDateTime com LocalTime
		
		//calcula intervalo de segundos e nanosegundos
		Duration d1 = Duration.between(dt1, dt2);
		Duration d2 = Duration.between(time1, time2);
		
		System.out.println(d1);
		System.out.println(d2);	
		
		//Period:
		//calcula intervalo de datas
		
		Period p1 = Period.between(dt2.toLocalDate(), dt1.toLocalDate());
		System.out.println(p1);
	}
}