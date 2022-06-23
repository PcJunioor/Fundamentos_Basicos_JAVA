package desafioClasse;

public class Pessoa {
		
	private String nomePessoa ;
	private double pesoPessoa;
	
	 Pessoa(String nomePessoa, double pesoPessoa){
	
		 this.nomePessoa = nomePessoa;
		 this.pesoPessoa = pesoPessoa;
		 		
	}
	 
	 String imprimirPessoa() {
		 return nomePessoa + " >>> Peso: " + pesoPessoa + "Kg";
	 }
	 
	 void comerComida(Comida c) {
		 
		 pesoPessoa += c.getPesoComida();
		 
	 }

}
