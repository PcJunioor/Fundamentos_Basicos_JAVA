package lambdas;



import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		
		/*
		 * 1. A partir do do produto calcular o preço real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%) / <2500 (isento)
		 * 3. Frete: >= 3000 (100) / < 3000 (50)
		 * 4. Arredondar: Deixar duas casas Decimais
		 * 5. Formatar: R$ 1234,56
		 */
			

		Produto p = new Produto("iPad", 2000.00, 0.10);
		Function<Produto, Double> precoReal = produto -> produto.preco * (1 - produto.desconto);
		
		//2 formas de fazer
		//Function<Double, Double> imposto = num -> num >= 2500 ? num * (1.085) : num;
		//Function<Double, Double> frete = num -> num >= 3000 ? num + 100 : num + 50;
		
		UnaryOperator<Double> imposto = preco -> preco >= 2500 ? preco * 1085 : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		Function<Double, String> duasCasas = num ->  String.format("%.2f", num);
		Function<String, String> formatar = texto -> ("R$" + texto).replace(".", ",");
		
		System.out.println("Preço Final: " + precoReal.andThen(imposto).andThen(frete)
					.andThen(duasCasas).andThen(formatar).apply(p));


	}

}
