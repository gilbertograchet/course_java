package estruturaCondicional;

import java.util.Scanner;

public class Exer2_VerificarNumeroParOuImpar {

	public static void main(String[] args) {
		
		// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		
		Scanner sc = new Scanner (System.in); //INICIANDO COMANDO PARA ENTRADA DE DADOS
		int number; //DECLARANDO VARIAVEL DO TIPO INT
		
		System.out.println("Digite um n�mero: "); //EXIBINDO MENSAGEM NA TELA
		number = sc.nextInt(); //ATRIBUINDO O VALOR DIGITADO ACIMA PARA VARIAVEL number

		if (number % 2 != 0) { //if (SE) O RESTO DA DIVIS�O DO NUMERO DIGITADO POR 2 FOR DIFERENTE DE 0 EXIBI A MENSAGEM ABAIXO
			System.out.println("O n�mero digitado � IMPAR!"); //EXIBI MENSAGEM NA TELA CASO IF ACIMA FOR VERDADEIRO
		} 
		
		else { //else (SEN�O) CASO A CONDI��O DO IF SEJA FALSA, EXECUTA O BLOCO DE COMANDOS ABAIXO
			System.out.println("O n�mero digitado � PAR!"); //EXIBI MENSAGEM NA TELA, CASO O IF ACIMA FOR FALSO
		}
		
		
		sc.close(); //FINALIZA COMANDO DE ENTRADA DE DADOS

	}

}
