package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares <C extends Number, V> {
	// LinkedHashSet GARANTE UMA ORDENAÇÃO PELA ORDEM DE INCLUSÃO
	private final Set<Par<C, V>> itens = new LinkedHashSet<>(); 
	
	
	
	public void adicionar(C chave, V valor) {
		if(chave == null) {
			return; // SAI DO MÉTODO
		}
		Par<C, V> novoPar = new Par<C, V>(chave,valor);
		// SE TIVER UMA CHAVE CRIADO ELE REMOVE O OBJETO DA LISTA E ADICIONA NOVAMENTE
		// FUNCIONA COMO ALTERAR O VALOR
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		itens.add(novoPar);				
	}
	
	public V getValor(C chave) {
		if(chave == null) {
			return null;
		}
		// FILTRA OS PARES COM A MESMA CHAVE PASSADA POR PARAMETRO
		Optional<Par<C, V>> parOptional = itens.stream().filter(par -> chave.equals(par.getChave()))
				.findFirst();
		return parOptional.isPresent()
				? parOptional.get().getValor() : null;
				
	}

}
