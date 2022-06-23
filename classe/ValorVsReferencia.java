package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //ATRIBUIÇÃO POR VALOR (TIPO PRIMITIVO)	
		
		a++;
		b--;
		System.out.println(a + " e " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // ATRIBUIÇÃO POR REFERÊNCIA (OBJETO)
		
		d2.dia = 12;
		d1.dia = 10;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		obterDataPadrao(d2);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
	}
	
	static void obterDataPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

}
