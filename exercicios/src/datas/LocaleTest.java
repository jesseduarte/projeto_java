package datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {

		//localização!! A lingua usa o padrao da ISO-639. pt = portugues, br = brasil, en = ingles
		Locale locale = new Locale("pt");
		Locale locale1 = new Locale("en");
		
		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar.DECEMBER, 23); //atribui uma data ao Calendar
		System.out.println(c.getTime()); //Sem o DateFormat
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale); 
		System.out.println(df.format(c.getTime())); //Com o DateFormat
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locale1);
		System.out.println(df1.format(c.getTime())); //Com o DateFormat
		
		System.out.println(locale1.getDisplayLanguage()); //retorna a lingua do locale
		System.out.println(locale.getDisplayLanguage(locale1)); //retorna a lingua do locale na lingua do parametro
		
		
	}
}
