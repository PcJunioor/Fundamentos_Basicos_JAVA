package classe;

import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		int dia,mes,ano;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Vamos para primeira data...");
		System.out.print("Dia: ");
		dia = entrada.nextInt();
		System.out.print("Mês: ");
		mes = entrada.nextInt();
		System.out.print("Ano: ");
		ano = entrada.nextInt();
		
		Data d1 = new Data(dia, mes, ano); //CONSTRUTOR
		
		var d2 = new Data(); // CONSTRUTOR PADRÃO
		
		
			
		System.out.print("Data 1: " + d1.obterDataFormatada());
		System.out.print("\nData 2: " + d2.obterDataFormatada());
		
		
		
		entrada.close();
		
		
		
	}

}
