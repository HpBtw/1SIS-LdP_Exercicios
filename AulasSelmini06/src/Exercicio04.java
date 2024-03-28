import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double x, y;
		
		System.out.print("Informe o valor de x, desde que não esteja entre '5' e '-5' --> ");
		x = teclado.nextDouble();
		// não pode ser 5 pois não há divisão por 0 (5 - 5) = 0
		
		y = 8 / (Math.sqrt(x * x - 25));
		
		if (x > 5 || x < -5) {
			System.out.println(y);

		}
		else {
		
		System.err.print("Favor, não colocar valores entre 5 e -5");
		
		}
		
		teclado.close();

	}

}
