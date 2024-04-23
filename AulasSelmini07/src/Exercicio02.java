import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		double valorTaxa = 0, valorDiaria = 0, dias, valorFinal;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o número de dias passados no hotel ");
		dias = teclado.nextDouble();
		
		if (dias >= 0) {
			if (dias > 15) {
			valorTaxa = dias * 15.50;
			valorDiaria = dias * 250;
			}
			else if (dias == 15) {
			valorTaxa = dias * 36;
			valorDiaria = dias * 250;
			}
			else if (dias < 15) {
			valorTaxa = dias * 58;
			valorDiaria = dias * 250;
			}
					
			valorFinal = valorTaxa + valorDiaria;
		
			System.out.println("O valor a ser pago será --> " + valorFinal);
		}
		else {
			System.err.println("É impossível ter passado 0 ou menos dias no hotel, bobão");
		}

		teclado.close();
	}
}