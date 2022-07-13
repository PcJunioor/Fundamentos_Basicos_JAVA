package oo.heranca.DesafioHeranca;

 class Carro {
	
	private int delta = 5;
	public final int VELOCIDADE_MAXIMA;
	
	protected int velocidadeAtual; //acrescentar de 5 em 5..frear tb
	
	Carro(int velocidadeMax){
		VELOCIDADE_MAXIMA = velocidadeMax;
	}
	
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}
		else
			velocidadeAtual += getDelta();
	}
	
	public int getDelta() {
		return delta;
	}


	public void setDelta(int delta) {
		this.delta = delta;
	}


	public void frear() {
		if(velocidadeAtual != 0) {
			velocidadeAtual -= 5;
		}
		else
			System.out.println("Carro j� est� parado");
		
	}


	@Override
	public String toString() {
		return  velocidadeAtual + "";
	}
	
	

}
