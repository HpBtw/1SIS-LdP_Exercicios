import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercicioExemplo {

	public static void main(String[] args) {
		double n1, n2, n3, nFinal;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat mascara = new DecimalFormat("0.00");
		// se quiser menos numeros depois da virgula, basta diminuir a quantia de verbos
				
		System.out.print("Digite a nota 1 do aluno ");
		n1 = teclado.nextDouble();
		
		System.out.print("Digite a nota 2 do aluno ");
		n2 = teclado.nextDouble();
		
		System.out.print("Digite a nota 3 do aluno ");
		n3 = teclado.nextDouble();
		
		nFinal = (n1 + n2 + n3) / 3;
		
		System.out.println("A média final do aluno será " + mascara.format(nFinal));
		// Poderia ser String.format("%.2f", nFinal)
		
		if (nFinal >= 6) {
			System.out.println("O aluno está aprovado");
		}
		
		else {
			System.err.println("O aluno está reprovado");
			// err pra mensagenzinha vermelha
		}
		
		teclado.close();

	}

}
