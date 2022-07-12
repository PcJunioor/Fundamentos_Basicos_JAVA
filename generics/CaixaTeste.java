package generics;

public class CaixaTeste {
	public static void main(String[] args) {
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("TIPO STRING");
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);		
		// OUTRA FORMA
		System.out.println(caixaA.abrir());
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(2.35);
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);		
		// OUTRA FORMA
		System.out.println(caixaB.abrir());
		
	}

}
