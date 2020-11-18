package estruturaCondicional;

import java.util.Scanner;

public class Exer2_VerificarNumeroParOuImpar {

	public static void main(String[] args) {
		
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner sc = new Scanner (System.in); //INICIANDO COMANDO PARA ENTRADA DE DADOS
		int number; //DECLARANDO VARIAVEL DO TIPO INT
		
		System.out.println("Digite um número: "); //EXIBINDO MENSAGEM NA TELA
		number = sc.nextInt(); //ATRIBUINDO O VALOR DIGITADO ACIMA PARA VARIAVEL number

		if (number % 2 != 0) { //if (SE) O RESTO DA DIVISÃO DO NUMERO DIGITADO POR 2 FOR DIFERENTE DE 0 EXIBI A MENSAGEM ABAIXO
			System.out.println("O número digitado é IMPAR!"); //EXIBI MENSAGEM NA TELA CASO IF ACIMA FOR VERDADEIRO
		} 
		
		else { //else (SENÃO) CASO A CONDIÇÃO DO IF SEJA FALSA, EXECUTA O BLOCO DE COMANDOS ABAIXO
			System.out.println("O número digitado é PAR!"); //EXIBI MENSAGEM NA TELA, CASO O IF ACIMA FOR FALSO
		}
		
		
		sc.close(); //FINALIZA COMANDO DE ENTRADA DE DADOS

	}

}
