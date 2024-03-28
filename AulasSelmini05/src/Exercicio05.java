import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio05 {

	public static void main(String[] args) {
		
		double valorHoras, numeroHoras, desconto, salarioBruto, inss, salarioLiquido;
		DecimalFormat mascara = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira o valor da Hora-Aula ");
		valorHoras = teclado.nextDouble();
		
		System.out.print("Insira o número de horas trabalhadas neste mês ");
		numeroHoras = teclado.nextDouble();

		System.out.print("Insira a porcentagem, em  decimais, o valor do desconto do INSS ");
		desconto = teclado.nextDouble();
		
		salarioBruto = valorHoras * numeroHoras;
		inss = salarioBruto * desconto;
		salarioLiquido = salarioBruto - (salarioBruto * desconto);
		
		System.out.println("O salário bruto será --> " + mascara.format(salarioBruto));
		System.out.println("O desconto do INSS será de --> " + mascara.format(inss) + " reais ");
		System.out.println("O salário líquido será --> " + mascara.format(salarioLiquido));
		
		teclado.close();

	}

}
