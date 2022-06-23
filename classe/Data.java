package classe;

public class Data {
	
	int dia, mes, ano;
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970); // FUNCIONA COMO UM CONSTRUTOR
	}
	
	Data (int dia, int mes, int ano){
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	String obterDataFormatada() {
		String formato = "%d/%d/%d";
		return String.format(formato,dia, mes, ano);
		
		//return dia + "/" + mes + "/" + ano;
	}
	

}
