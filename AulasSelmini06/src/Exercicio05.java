import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double v1, v2, v3;
		
		System.out.print("Informe o primeiro valor --> ");
		v1 = teclado.nextDouble();
		
		System.out.print("Informe o segundo valor --> ");
		v2 = teclado.nextDouble();

		System.out.print("Informe o terceiro valor --> ");
		v3 = teclado.nextDouble();
		
		if (v1 < (v2 + v3) && v2 < (v1 + v3) && v3 < (v1 + v2)) {
			System.out.println("Os valores podem representar os lados de um triângulo");
	}
		else {
			System.err.println("Os valores não podem representar os lados de um triângulo");
		}
		
		teclado.close();
		
	}
}

