import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		int bits, decimal, unidade, dezena, centena, milhar;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira um valor em bits ");
		bits = teclado.nextInt();

		unidade = bits % 10;
		dezena = bits % 100 / 10;
		centena = bits % 1000 / 100;
		milhar = bits / 1000;
		
		decimal = (unidade * 1) + (dezena * 2) + (centena * 4) + (milhar * 8);
		
		System.out.print("Valor convertido em decimal será --> " + decimal);
		
		teclado.close();

	}

}