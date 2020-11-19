package estruturasRepetitivas;

import java.util.Scanner;

public class Exer2_VerQtdeDeProdutosVendidos {

	public static void main(String[] args) {
		// Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		// preferência de seus clientes. Escreva
		// um algoritmo para ler o tipo de combustível abastecido (codificado da
		// seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		// 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
		// deve ser solicitado um novo código (até
		// que seja válido). O programa será encerrado quando o código informado for o
		// número 4. Deve ser escrito a
		// mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		// tipo de combustível.

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
				System.out.println ("O id digitado não é válido!");
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
