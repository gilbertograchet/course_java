package estruturaCondicional;

import java.util.Scanner;

public class Exer1_VerificarNumeroPositivoOuNegativo {

	public static void main(String[] args) {
		
		// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		
		Scanner sc = new Scanner (System.in); //INICIANDO COMANDO PARA ENTRADA DE DADOS
		
		int number; //DECLARANDO VARIAVEL DO TIPO INTEIRA
		
		System.out.println ("Digite um n�mero: "); //EXIBINDO MENSAGEM NA TELA
		number = sc.nextInt(); //ATRIBUINDO O VALOR DIGITADO ACIMA PARA VARIAVEL ID_Funcionario
		
		if (number > 0) {	//COMANDO if (SE), CASO A POSSIBILIDADE (number > 0) SEJA VERDADEIRA, EXECUTA O BLOCO DE COMANDOS DENTRO DO {}
			System.out.println("O n�mero digitado � POSITIVO"); //EXIBI MENSAGEM NA TELA, CASO A POSSIBILIDADE ACIMA FOR VERDADEIRA.
		} 
		else { 				//COMANDO else (SEN�O), CASO A POSSIBILIDADE DO IF SEJA FALSA, EXECUTA ESTE BLOCO DE COMANDOS DENTRO DO {}.
			System.out.println("O n�mero digitado � NEGATIVO"); //EXIBI RESULTADO NA TELA, CASO ESTE BLOCO DE COMANDOS SEJA EXECUTADO.
		}
									
		sc.close(); //FINALIZA COMANDO DE ENTRADA DE DADOS.
		
		}
		
		
	}


