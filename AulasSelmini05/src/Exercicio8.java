import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		int cru, dezena, valor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira um valor ");
		valor = teclado.nextInt();
		
		// % serve pra isolar um numero que existiria
		// depois da virgula caso não fosse um numero inteiro
		// por ex, 352 % 10 resultaria em 2; 352 % 100 resultaria em 52
		
		cru = valor % 100;
		dezena = cru / 10;
				
		System.out.print("A dezena é --> " + dezena);
		
		teclado.close();
		
	}
}