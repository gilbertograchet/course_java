package comandosbasicos;

import java.util.Scanner;

public class Exer3_CalcularValorMedioEntreNumeros {

	public static void main(String[] args) {
		// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		Scanner sc = new Scanner (System.in); //INICIANDO COMANDO PARA ENTRADA DE DADOS 
		int Valor_1, Valor_2, Valor_3, Valor_4, Diferenca;
		
		System.out.println ("Digite o primeiro valor: "); //EXIBINDO MENSAGEM NA TELA
		Valor_1 = sc.nextInt(); //ATRIBUINDO O VALOR DIGITADO ACIMA PARA VARIAVEL Valor_1
		
		System.out.println ("Digite o segundo valor: "); //EXIBINDO MENSAGEM NA TELA
		Valor_2 = sc.nextInt(); //ATRIBUINDO O VALOR DIGITADO ACIMA PARA VARIAVEL Valor_2
		
		System.out.println ("Digite o terceiro valor: "); //EXIBINDO MENSAGEM NA TELA
		Valor_3 = sc.nextInt(); //ATRIBUINDO O VALOR DIGITADO ACIMA PARA VARIAVEL Valor_3
		
		System.out.println ("Digite o quarto valor: "); //EXIBINDO MENSAGEM NA TELA
		Valor_4 = sc.nextInt(); //ATRIBUINDO O VALOR DIGITADO ACIMA PARA VARIAVEL Valor_4
		
		Diferenca = (Valor_1 * Valor_2 - Valor_3 * Valor_4); //CALCULANDO A DIFERENÇA DOS VALORES ATRIBUIDOS AS VARIAVEIS
		
		System.out.println ("A DIFERENÇA DO PRODUTO É: " + Diferenca); //EXIBINDO MENSAGEM NA TELA
		
		
		
		sc.close();

	}

}
