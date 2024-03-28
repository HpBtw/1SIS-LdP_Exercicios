import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio03 {

	public static void main(String[] args) {
		
		double valorCompra, valorFinal, valorDesconto;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat mascara = new DecimalFormat("0.00");
		
		System.out.print("Insira o valor das suas compras ");
		valorCompra = teclado.nextDouble();
		
		if (valorCompra > 1000) {
			valorDesconto = valorCompra * 0.15;
			valorFinal = valorCompra - valorDesconto;
			System.out.println("O desconto será de 15%, correspondente ao valor de R$" + mascara.format(valorDesconto));
			System.out.println("Com o desconto, o preço será R$" + mascara.format(valorFinal));
		}
		
		else {
			valorDesconto = valorCompra * 0.08;
			valorFinal = valorCompra - valorDesconto;
			System.out.println("O desconto será de 8%, correspondente ao valor de R$" + mascara.format(valorDesconto));
			System.out.println("Com o desconto de 8%, o preço será R$" + mascara.format(valorFinal));
		}
		
		teclado.close();
		
	}

}
