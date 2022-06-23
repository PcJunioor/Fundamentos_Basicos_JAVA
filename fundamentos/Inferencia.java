package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a  = 4.5;
		System.out.println(a);
		//INFERENCIA ( O JAVA ENTENDE AUTOMATICAMENTE O TIPO DA VARIAVEL)
		//AO DECLARAR POR INFERENCIA JÀ TEM QUE INICIALIZAR NA MESMA LINHA
		var b = 4.5; 
		System.out.println(b);
		
		var c = "TEXTO";
		System.out.println(c);
		
		c = "outro texto";
		System.out.println(c);
		
	}

}
 