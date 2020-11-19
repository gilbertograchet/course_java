package estruturasRepetitivas;

import java.util.Scanner;

public class Exer2_VerQtdeDeProdutosVendidos {

	public static void main(String[] args) {
		// Um Posto de combust�veis deseja determinar qual de seus produtos tem a
		// prefer�ncia de seus clientes. Escreva
		// um algoritmo para ler o tipo de combust�vel abastecido (codificado da
		// seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
		// 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4)
		// deve ser solicitado um novo c�digo (at�
		// que seja v�lido). O programa ser� encerrado quando o c�digo informado for o
		// n�mero 4. Deve ser escrito a
		// mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		// tipo de combust�vel.

		Scanner sc = new Scanner(System.in);

		int alcool, gasolina, diesel, id_produto;
		alcool = 0;
		gasolina = 0;
		diesel = 0;

		System.out.println ("Digite o id do produto: ");
		id_produto = sc.nextInt ();

		while (id_produto != 4) {
			if (id_produto == 1) {
				alcool = alcool + 1;
				System.out.println ("Digite o proximo id: ");
				id_produto = sc.nextInt ();
			} 
			else if (id_produto == 2) {
				gasolina = gasolina + 1;
				System.out.println ("Digite o proximo id: ");
				id_produto = sc.nextInt ();
			} 
			else if (id_produto == 3) {
				diesel = diesel + 1;
				System.out.println ("Digite o proximo id: ");
				id_produto = sc.nextInt ();
			} 
			else if (id_produto > 4 || id_produto == 0) {
				System.out.println ("O id digitado n�o � v�lido!");
				System.out.println ("Digite novamente o ID: ");
				id_produto = sc.nextInt ();
			} 
		
		} 

		System.out.println("MUITO OBRIGADO");
		System.out.println("Quantidade de Alcool Vendido: " + alcool);
		System.out.println("Quantidade de Gasolina Vendida: " + gasolina);
		System.out.println("Quantidade de Diesel Vendido: " + diesel);

		sc.close();

	}

}
