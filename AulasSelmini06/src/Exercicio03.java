import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio03 {

	public static void main(String[] args) {
		
		double valorCompra, valorFinal;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat mascara = new DecimalFormat("0.00");
		
		System.out.print("Insira o valor das suas compras ");
		valorCompra = teclado.nextDouble();
		
		if (valorCompra > 1000) {
			valorFinal = valorCompra - (valorCompra * 0.15);
			System.out.println("Com o desconto de 15%, o preço será " + mascara.format(valorFinal));
		}
		
		else {
			valorFinal = valorCompra - (valorCompra * 0.08);
			System.out.println("Com o desconto de 8%, o preço será " + mascara.format(valorFinal));
		}
		
		teclado.close();
		
	}

}
