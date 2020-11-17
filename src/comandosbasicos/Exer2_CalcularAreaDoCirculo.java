package comandosbasicos;

import java.util.Locale;
import java.util.Scanner;

public class Exer2_CalcularAreaDoCirculo {

	public static void main(String[] args) {
		
		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos.
		//Fórmula da área: area = π . raio2
		//Considere o valor de π = 3.14159

		Locale.setDefault(Locale.US); //DECLARANDO O PADRÃO DE TECLADO AMERICANO
		Scanner sc = new Scanner (System.in); //INICIANDO COMANDO PARA ENTRADA DE DADOS 
		
		double area, B, pi = 3.14159; //DECLARANDO VARIAVEIS
		
		System.out.println ("Digite o raio do circulo: "); //EXIBINDO MENSAGEM NA TELA
		B = sc.nextDouble(); //ATRIBUINDO O VALOR DIGITADO ACIMA PARA VARIAVEL B
		area = pi * B * B;		//CALCULO DA AREA
	    System.out.printf ("A Area do circulo é: %.4f%n", area); //EXIBINDO RESULTADO NA TELA	
	
	sc.close(); 		//ENCERRANDO O COMANDO DE ENTRADA DE DADOS
		
	}

}
