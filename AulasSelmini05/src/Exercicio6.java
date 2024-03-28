import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double x, y;
		
		System.out.print(" x --> ");
		x = teclado.nextDouble();

		y = Math.sqrt(Math.cbrt(x - 1 / 2));
		
		System.out.print("y = " + y);
		
		teclado.close();


	}
}
