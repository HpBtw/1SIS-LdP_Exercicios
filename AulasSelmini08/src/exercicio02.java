import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		String letra;
		
		System.out.println("Digite uma letra");
		letra = kb.next();
		
		letra = letra.toLowerCase();
		// transforma a variavel letra em minusculo e armazena
	
		
		switch(letra) {
		// poderia ser case "a","e","i","o","u":  (ja que todos vao executar o mesmo comando)
			case "a":
				System.out.println("Vogal");
				break;
			case "e": 
				System.out.println("Vogal");
				break;
			case "i":
				System.out.println("Vogal");
				break;
			case "o":
				System.out.println("Vogal");
				break;
			case "u":
				System.out.println("Vogal");
				break;
			default:	
				System.out.println("Não é vogal consoante");
			
		}
		
		kb.close();
	}

}
