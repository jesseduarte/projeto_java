package datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		
		//Fazendo datas personalizadas:
		
		Calendar c = Calendar.getInstance();
		String mascara = "yyyy.MM.dd G 'as' HH:mm:ss z"; //esse pattern pega na documentacao
		SimpleDateFormat formatador = new SimpleDateFormat(mascara);
		System.out.println(formatador.format(c.getTime()));
	}
}
