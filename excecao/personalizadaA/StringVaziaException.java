package excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException{
	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O Atributo '%s' est� vazio",
				nomeDoAtributo);
	}
	
	
}
