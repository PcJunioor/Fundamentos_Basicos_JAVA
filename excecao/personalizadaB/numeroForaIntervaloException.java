 package exceção.personalizadaB;

@SuppressWarnings("serial")
public class numeroForaIntervaloException extends Exception{
	private String nomeDoAtributo;
	
	public numeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O Atributo '%s' está fora do intervalo",
				nomeDoAtributo);
	}
	
	
}
