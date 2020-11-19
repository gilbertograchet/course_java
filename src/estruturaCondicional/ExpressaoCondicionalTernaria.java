package estruturaCondicional;

import java.util.Scanner;

public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		
		//EXPRESS�O CONDICIONAL TERNARIA.
		//Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condi��o.
		// (CONDI��O) ? VALOR_SE_VERDADEIRO : VALOR_SE_FALSO
		
		Scanner sc = new Scanner(System.in);
		
		double preco = 10.00;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println (desconto);

		sc.close();

	}

}
