import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int v1, v2, v3;
		
		System.out.println("Informe o valor 1");
		v1 = teclado.nextInt();

		System.out.println("Informe o valor 2");
		v2 = teclado.nextInt();

		System.out.println("Informe o valor 3");
		v3 = teclado.nextInt();
		
		if (v1 != v2 || v1 != v3 || v2 != v3) {
			System.out.println("Os valores são diferentes entre si");
			if (v1 < v2 && v1 < v3) {
				System.out.println(+ v1 + " é o menor entre eles");
			}
			else if (v2 < v1 && v2 < v3) {
				System.out.println(+ v2 + " é o menor entre eles");
			}
			else {
				System.out.println(+ v3 + " é o menor entre eles");
			}
		}
		else {
			System.out.println("Os números são iguais, informe números diferentes entre si");
		}
		
		teclado.close();
	}

}
