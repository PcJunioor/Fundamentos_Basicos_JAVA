package desafioClasse;

public class Comida {
	

	private double pesoComida;
	private String nomeComida;
	private int opcao;
	
	Comida(int opcao, String nomeComida, double pesoComida){
		this.setOpcao(opcao);
		this.nomeComida = nomeComida;
		this.setPesoComida(pesoComida);
				
	}
	
	String imprimirComida() {
		return getOpcao() + " - " + nomeComida + " >>> Peso: " + getPesoComida() + "Kg";
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	
	public double getPesoComida() {
		return pesoComida;
	}


	public void setPesoComida(double pesoComida) {
		this.pesoComida = pesoComida;
	}

}
