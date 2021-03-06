package data;

public class Data {

	public int dia;
	public int mes;
	public int ano;
	
	Data() {
			//dia = 01;
			//mes = 01;
			//ano = 1970;
			this(01,01,1970); //o this() e um metodo que a partir de um constr, eu chamo o outro constr.
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String obterDataFormatada() {
		final String formato = "%d/%d/%d"; //variavel local 
		return String.format(formato, dia,mes,ano);
	}
}