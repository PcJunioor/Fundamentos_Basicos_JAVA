package classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.14 ;  // ASSOCIADO DIRETAMENTE A CLASSE FINAL NÃO DEIXA ALTERAR O VALOR
	
	AreaCirc(double raioInicial){
		
		raio = raioInicial;
				
	}
	
	static double area(double raio) {
		return raio * raio * PI;
		
	}
	
	double area() {
		return raio * raio * PI;
	}

}
