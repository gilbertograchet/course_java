package estruturaCondicional;

import java.util.Scanner;

public class Exer1_VerificarNumeroPositivoOuNegativo {

	public static void main(String[] args) {
		
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner (System.in); //INICIANDO COMANDO PARA ENTRADA DE DADOS
		
		int number; //DECLARANDO VARIAVEL DO TIPO INTEIRA
		
		System.out.println ("Digite um número: "); //EXIBINDO MENSAGEM NA TELA
		number = sc.nextInt(); //ATRIBUINDO O VALOR DIGITADO ACIMA PARA VARIAVEL ID_Funcionario
		
		if (number > 0) {	//COMANDO if (SE), CASO A POSSIBILIDADE (number > 0) SEJA VERDADEIRA, EXECUTA O BLOCO DE COMANDOS DENTRO DO {}
			System.out.println("O número digitado é POSITIVO"); //EXIBI MENSAGEM NA TELA, CASO A POSSIBILIDADE ACIMA FOR VERDADEIRA.
		} 
		else { 				//COMANDO else (SENÃO), CASO A POSSIBILIDADE DO IF SEJA FALSA, EXECUTA ESTE BLOCO DE COMANDOS DENTRO DO {}.
			System.out.println("O número digitado é NEGATIVO"); //EXIBI RESULTADO NA TELA, CASO ESTE BLOCO DE COMANDOS SEJA EXECUTADO.
		}
									
		sc.close(); //FINALIZA COMANDO DE ENTRADA DE DADOS.
		
		}
		
		
	}


