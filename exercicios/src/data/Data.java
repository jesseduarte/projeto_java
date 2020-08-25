package data;

public class Data {

	public int dia;
	public int mes;
	public int ano;
	
	Data() {
			dia = 01;
			mes = 01;
			ano = 1970;
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String obterDataFormatada() {
		return String.format("%d/%d/%d", dia,mes,ano);
	}
}
