import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio02 {

	public static void main(String[] args) {
		
		double trabalho1, trabalho2, trabalho3, trabalhoMedia, prova1, prova2, provaMedia, mediaFinal, tolerancia;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat mascara = new DecimalFormat("0.00");
		
		tolerancia = 0.000000001;
		
		System.out.print("Informe a nota do 1º trabalho ");
		trabalho1 = teclado.nextDouble();
		
		System.out.print("Informe a nota do 2º trabalho ");
		trabalho2 = teclado.nextDouble();
		
		System.out.print("Informe a nota do 3º trabalho ");
		trabalho3 = teclado.nextDouble();
		
		System.out.print("Informe a nota da 1º prova ");
		prova1 = teclado.nextDouble();
		
		System.out.print("Informe a nota do 2º prova ");
		prova2 = teclado.nextDouble();
		
		trabalhoMedia = (trabalho1 + trabalho2 + trabalho3) / 3;
		provaMedia = (prova1 + prova2) / 2;
		mediaFinal = (provaMedia * 0.70) + (trabalhoMedia * 0.30);
		
		System.out.println("A média final do aluno será " + mascara.format(mediaFinal));
		
		if (mediaFinal >= 6 - tolerancia){
			System.out.println("O aluno está aprovado");
		}
		
		else {
			System.err.println("O aluno está reprovado");
		}
		
		teclado.close();

	}

}
