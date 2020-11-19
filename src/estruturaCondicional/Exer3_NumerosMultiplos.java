package estruturaCondicional;

import java.util.Scanner;

public class Exer3_NumerosMultiplos {

	public static void main(String[] args) {
		// Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		//Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
		//ordem crescente ou decrescente.
		
		Scanner sc = new Scanner (System.in); //INICIANDO COMANDO PARA ENTRADA DE DADOS
		int number1, number2; //DECLARANDO VARIAVEIS DO TIPO INT
		
		System.out.println("Digite um n�mero: "); //EXIBINDO MENSAGEM NA TELA
		number1 = sc.nextInt(); //ATRIBUINDO O VALOR DIGITADO ACIMA PARA VARIAVEL number1
		System.out.println("Digite outro n�mero: "); //EXIBINDO MENSAGEM NA TELA
		number2 = sc.nextInt(); //ATRIBUINDO O VALOR DIGITADO ACIMA PARA VARIAVEL number2
		
		if (number1 % number2 == 0 || number2 % number1 == 0) { //if (SE) O RESTO DA DIVIS�O DO NUMERO DIGITADO PELO OUTRO NUMERO DIGITADO FOR = 0 EXIBI A MENSAGEM ABAIXO
			System.out.println("Os n�meros S�O multiplos"); //EXIBI MENSAGEM NA TELA CASO IF ACIMA FOR VERDADEIRO			
		}

		else { //else (SEN�O) CASO A CONDI��O DO IF SEJA FALSA, EXECUTA O BLOCO DE COMANDOS ABAIXO
			System.out.println("Os n�meros N�O s�o multiplos"); //EXIBI MENSAGEM NA TELA, CASO O IF ACIMA FOR FALSO
		}
		
		sc.close(); //ENCERRA COMANDO DE ENTRADA DE DADOS
		
	}
	

}
