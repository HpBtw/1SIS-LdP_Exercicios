import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int v1, v2, v3, aux;
		
		System.out.println("Escreva o primeiro número");
		v1 = teclado.nextInt();
		
		System.out.println("Escreva o segundo número");
		v2 = teclado.nextInt();
		
		System.out.println("Escreva o terceiro número");
		v3 = teclado.nextInt();
		
		if (v1 > v2) {
			aux = v1;
			v1 = v2;
			v2 = aux;
		}
		if (v1 > v3) {
			aux = v1;
			v1 = v3;
			v3 = aux;
			}
		if (v2 > v3) {
			aux = v2;
			v2 = v3;
			v3 = aux;
		}
		
		System.out.println(v1 + " " + v2 + " " + v3);
		
		teclado.close();
	}

}
