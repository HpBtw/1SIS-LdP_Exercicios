import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor, unidade, dezena, centena, invertido;
		
		System.out.println("Insira um valor de 3 dígitos ");
		valor = teclado.nextInt();
		
		unidade = valor % 10;
		dezena = valor % 100 / 10;
		centena = valor / 100;
		
		invertido = unidade * 100 + dezena * 10 + centena;
		
		System.out.print("Este valor invertido será --> " + invertido);
		
		teclado.close();

	}

}
