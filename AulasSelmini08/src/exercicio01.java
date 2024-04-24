import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String letra;
		
		System.out.println("Digite uma letra");
		letra = kb.next();
		
		letra = letra.toLowerCase();
		// transforma a variavel letra em minusculo e armazena

		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println("A letra inserida é uma vogal.");
		}
		else {
			System.out.println("A letra inserida não é uma vogal.");
		}
		
		kb.close();
	}
}
