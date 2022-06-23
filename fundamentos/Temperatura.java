package fundamentos;
// (°F - 32 ) x 5/9.0 = °C ** EM DIVISÕES NO JAVA TEM QUE COLOCAR .0 **
// CONSTANTES p/ 32 e 5/9
// VARIAVEIS TEMPERATURA EM F e resultado em C
public class Temperatura {
	public static void main(String[] args) {
		
		final double ajuste = 32;
		final double fator = 5/9.0;
		double ctemp;
		double ftemp = 86;
		//double resultado;
		 
		ctemp = (ftemp - ajuste) * fator;
		
		System.out.println(ftemp + "°F equivale a: " + ctemp + "°C");
		
		
		
		
	}


	
	
	
	
}
