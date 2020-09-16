package datas;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {
	
	public static void main(String[] args) {
		
		//Formata��o das datas:
		
		Calendar c = Calendar.getInstance();
		DateFormat[] dfs = new DateFormat[6];
		dfs[0] = DateFormat.getInstance();
		dfs[1] = DateFormat.getDateInstance();
		dfs[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfs[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfs[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dfs[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for(DateFormat df: dfs) {
			System.out.println(df.format(c.getTime())); //pegando um met do Date (getTime()) e nao do Calendar
		}
	}
}