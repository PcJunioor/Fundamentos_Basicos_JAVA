package exceção.personalizadaA;

@SuppressWarnings("serial")
public class numeroForaIntervaloException extends RuntimeException{
	private String nomeDoAtributo;
	
	public numeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O Atributo '%s' está fora do intervalo",
				nomeDoAtributo);
	}
	
	
}
