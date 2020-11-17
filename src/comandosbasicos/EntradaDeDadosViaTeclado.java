package comandosbasicos;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosViaTeclado {

	public static void main(String[] args) {
		
		// ENTRADA DE DADOS VIA DISPOSITIVO DE ENTRADA (TECLADO)
		Locale.setDefault(Locale.US); // DEFININDO PADRÃO DE TECLADO US.
		
		Scanner sc = new Scanner (System.in); // MOSTRANDO QUE TEREMOS A ENTRADA DE 'DADOS' A SEREM EXIBIDOS NA TELA		
		
		String x;   // DECLARANDO VARIAVEL DO TIPO STRING
		int y; 	   // DECLARANDO VARIAVEL DO TIPO INTEIRO
		double z; // DECLARANDO VARIAVEL DO TIPO DOUBLE (NUMERO COM PONTO)
		char w;  // DECLARANDO VARIAVEL DO TIPO CARACTER
		
		// PARA LER UMA PALAVRA COMANDO > sc.next 
		// PARA LER VARIAS PALAVRAS COMANDO > sc.nextLine
		System.out.println("Digite as palavras: "); // ESCREVENDO NA TELA A 'AÇÃO' A SER TOMADA
		//System.out.println("Digita UMA palavra: ");
		x = sc.nextLine(); // VARIAVEL X RECEBE O QUE FOI DIGITADO
		
		// PARA LER UM NUMERO INTEIRO COMANDO > sc.nextInt
		System.out.println("Agora digite um numero inteiro:");
		y = sc.nextInt();
		
		// PARA LER UM NUMERO COM PONTO COMANDO > sc.nextDouble
		System.out.println("Digite um numero com ponto: ");
		z = sc.nextDouble();
		
		// PARA LER UM CARACTER COMANDO > sc.next().charAt(0) > o comando charAt(0) pega o primeiro caracter da string
		System.out.println("Digite um caracter: ");
		w = sc.next().charAt(0);
		
		// EXIBINDO O RESULTADO NA TELA
		System.out.println("Você digitou a palavra: " + x);
		System.out.println("Você digitou o numero: "  + y);
		System.out.println("Você digitou o numero com ponto: " + z);
		System.out.println("Você digitou o caracter: " + w);
		
		//COMANDO PARA ENCERRAR O SCANNER > sc.close
		sc.close();	
		
	}

}
