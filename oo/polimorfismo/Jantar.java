package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(0);
		
		Arroz ingred1 = new Arroz(0.25);
		Feijao ingred2 = new Feijao(0.18);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingred1);
		convidado.comer(ingred2);
		
		System.out.println(convidado.getPeso());
	}

}
