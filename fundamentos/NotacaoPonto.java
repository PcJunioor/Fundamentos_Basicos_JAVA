package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom Dia "; // String não é um tipo primitivo
		s = s.toUpperCase(); // Tipos primitivos não tem operador "."
		
		System.out.println(s);
		
		s = s.replace("BOM DIA ", "Boa Tarde");
		System.out.println(s);
		System.out.println(a);
		
	}

}
