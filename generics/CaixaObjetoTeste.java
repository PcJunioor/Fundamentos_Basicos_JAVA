package generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // converte de double (primitivo) para Double (Wrapper)
		
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("String"); // converte de double (primitivo) para Double (Wrapper)
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
		
	}

}
