package data;

public class Data {

	public int dia;
	public int mes;
	public int ano;
	
	public String obterDataFormatada() {
		return String.format("%d/%d/%d", dia,mes,ano);
	}
}
