package datas.novaAPIJava8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeAPITest3 {
	
	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();
		//Convertendo data em String:
		String s1 = data.format(DateTimeFormatter.BASIC_ISO_DATE);
		String s2 = data.format(DateTimeFormatter.ISO_DATE);
		System.out.println(s1);
		System.out.println(s2);
		
		//Convertendo String em data:
		String s3 = "20200902";
		String s4 = "2020-09-02";
		LocalDate parse1 = LocalDate.parse(s3, DateTimeFormatter.BASIC_ISO_DATE);
		LocalDate parse2 = LocalDate.parse(s4, DateTimeFormatter.ISO_DATE);
		System.out.println(parse1);
		System.out.println(parse2);
	}
}