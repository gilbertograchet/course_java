package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exer4_CalcularImpostoDeRenda {

	public static void main(String[] args) {
		// Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
		// mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		// De 0.00 á 2000.00 = ISENTO
		// De 2000.01 á 3000.00 = 8%
		// De 3000.01 á 4500.00 = 18%
		// Acima de 4500.00 = 28%
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); //INICIANDO COMANDO PARA ENTRADA DE DADOS
		
		double salary, tax;
		
		System.out.println("Digite o salario: ");
		salary = sc.nextDouble ();
		
		if (salary <= 2000.00) {
			System.out.println ("VOCÊ É ISENTO DE PAGAR O IMPOSTO");			
		}		
		else if (salary <= 3000.00) {
			tax = (salary * 0.08);
			System.out.printf ("O VALOR DO IMPOSTO A SER PAGO É: R$ %.2f%n " , tax);			
		}		
		else if (salary <= 4500.00) {
			tax = (salary * 0.18);
			System.out.printf ("O VALOR DO IMPOSTO A SER PAGO É: R$ %.2f%n " , tax);
		}
		else {
			tax = (salary * 0.28);
			System.out.printf ("O VALOR DO IMPOSTO A SER PAGO É: R$ %.2f%n " , tax);
		}		
		
		sc.close();
		
	}

}
