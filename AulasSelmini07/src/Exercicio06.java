import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String cargo;
		int tServico, perCent;
		double salario, salarioFinal, aumento;
		
		System.out.println("Digite qual seu cargo na empresa");
		cargo = teclado.next();
		
		System.out.println("Digite seu tempo de serviço em anos");
		tServico = teclado.nextInt();
		
		System.out.println("Digite seu salário atual");
		salario = teclado.nextDouble();
		
		if (cargo.equalsIgnoreCase("gerente") || cargo.equalsIgnoreCase("tecnico") || cargo.equalsIgnoreCase("engenheiro"))  {
			if (cargo.equalsIgnoreCase("gerente")) {
				if (tServico >= 5) {
					perCent = 10;
					aumento = 0.10;
				}
				else if (tServico >= 3 && tServico < 5) {
					perCent = 9;
					aumento = 0.09;
				}
				else {
					perCent = 8;
					aumento = 0.08;
				}
			}
			else if (cargo.equalsIgnoreCase("engenheiro")) {
				if (tServico >= 5) {
					perCent = 11;
					aumento = 0.11;
				}
				else if (tServico >= 3 && tServico < 5) {
					perCent = 10;
					aumento = 0.10;
				}
				else {
					perCent = 9;
					aumento = 0.09;
				}
			}
			else { 
				if (tServico >= 5) {
					perCent = 12;
					aumento = 0.12;
				}
				else if (tServico >= 3 && tServico < 5) {
					perCent = 11;
					aumento = 0.11;
				}
				else {
					perCent = 10;
					aumento = 0.10;
				}
			}
			
			
			salarioFinal = salario + (salario * aumento);
			
			System.out.println("Seu salário atual é de " + salario + " reais");
			System.out.println("Você receberá " + perCent + "% de aumento, seu novo salário será " + salarioFinal + " reais. Sendo assim, uma diferença de " + (salarioFinal - salario) + " reais.");
		}
		else {
			salarioFinal = salario + (salario * 0.05);
			System.out.println("Você receberá 5% de aumento, sendo assim, seu novo salário será de " + salarioFinal + " reais. Sendo assim, uma diferença de " + (salarioFinal - salario) + " reais.");
		}
		
		teclado.close();
		
	}

}
