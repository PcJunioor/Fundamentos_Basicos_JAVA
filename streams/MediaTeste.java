package streams;

public class MediaTeste {
	public static void main(String[] args) {
		
		Media m1 = new Media();
		Media m2 = new Media();
		// 2 FORMAS DE ADICIONAR
		m1.adicionar(9.2);
		m1.adicionar(4);
		System.out.println(m1.getValor());
		// 2 FORMAS DE ADICIONAR
		System.out.println(m2.adicionar(9).adicionar(7).getValor());
		
		System.out.println(Media.combinar(m1, m2).getValor());
	
	}
		
		
		
		

}
