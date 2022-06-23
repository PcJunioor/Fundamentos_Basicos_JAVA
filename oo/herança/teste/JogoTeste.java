package oo.herança.teste;

import oo.herança.Heroi;
import oo.herança.Jogador;

public class JogoTeste {
	public static void main(String[] args) {
		
		Jogador j1 = new Heroi(10,10);
		Jogador j2 = new Jogador(10,11);
		
		
		
		j1.atacar(j2);
		
		System.out.println(j1);
		System.out.println(j2);
	}

}
