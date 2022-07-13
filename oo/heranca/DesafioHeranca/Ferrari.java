package oo.heranca.DesafioHeranca;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	
	
	
	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int velocidadeMax){
		super(velocidadeMax);
		setDelta(15);
	}
	
	public void acelerar() {
		if(velocidadeAtual <= VELOCIDADE_MAXIMA) {
			velocidadeAtual += getDelta();
		}
		else
			System.out.println("Velocidade m�xima atingida!!");

	}
	public void ligarAr() {
		ligarAr = true;		
	}
	
	public void desligarAr() {
		ligarAr = false;
	}
	
	public void ligarTurbo() {
		ligarTurbo = true;
		
		
		
	}
	public void desligarTurbo() {
		ligarTurbo = false;
		
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;			
		}
	}
	
	
	
}