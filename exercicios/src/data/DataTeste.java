package data;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 25;
		d1.mes = 01;
		d1.ano = 1992;
		String dataFormatadaD1 = d1.obterDataFormatada();
		Data d2 = new Data();
		d2.dia = 04;
		d2.mes = 11;
		d2.ano = 1996;
		String dataFormatadaD2 = d2.obterDataFormatada();
		
		System.out.println(dataFormatadaD1);
		System.out.println(dataFormatadaD2);
	}
}
