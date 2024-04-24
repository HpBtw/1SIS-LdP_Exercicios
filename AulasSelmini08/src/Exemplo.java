import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int valor, aux;
		
		System.out.println("Digite um número");
		valor = kb.nextInt();
		
		aux = valor % 2;
		
		if (aux == 1) {
			System.out.println("É um número ímpar");
		}
		else {
			System.out.println("É um número par");
		}

		kb.close();
	}

}
