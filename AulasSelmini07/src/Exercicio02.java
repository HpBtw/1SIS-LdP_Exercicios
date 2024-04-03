import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat mascara = new DecimalFormat("0.00");
		
		double numDiarias, valor;
		
		System.out.print("Digite o número de dias passados no hotel ");
		numDiarias = teclado.nextDouble();
		
		if (numDiarias > 15) {
			valor = 15.50 * numDiarias + 250;
			System.out.print("O valor das diárias será de --> " + mascara.format(valor));
		}
		else if (numDiarias == 15) {
			valor = 36 * numDiarias + 250;
			System.out.print("O valor da diárias será de --> " + mascara.format(valor));
	}
		else if (numDiarias < 15) {
			valor = 58 * numDiarias + 250;
			System.out.print("O valor de diárias será de --> " + mascara.format(valor));
		}

		teclado.close();
	}
}
