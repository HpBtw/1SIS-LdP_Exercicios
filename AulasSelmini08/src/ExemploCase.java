import java.util.Scanner;

public class ExemploCase {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int valor, aux;
		
		System.out.println("Digite um número");
		valor = kb.nextInt();
		
		aux = valor % 2;
		
		switch(aux) {
		case 0:
			System.out.println("Par");
			break;
		default:
			System.out.println("Ímpar");
			break;
		}
		
	//exemplo ternario
	//System.out.println((aux == 0) ? "Par" : "Ímpar");
		
		kb.close();
	}
}