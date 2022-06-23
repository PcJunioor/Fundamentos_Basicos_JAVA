package oo.encapsulamento.casaA;

public class Paulo {
	
	Ana esposa = new Ana();
	
	void testeAcessos() {
		System.out.println(esposa.pacote);
		System.out.println(esposa.protegido);
		System.out.println(esposa.publico);
		
	}

}
