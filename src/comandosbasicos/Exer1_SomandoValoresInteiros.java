package comandosbasicos;

import java.util.Scanner;

public class Exer1_SomandoValoresInteiros {

	public static void main(String[] args) {
		
		// EXERCICIO 1
		// Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma mensagem explicativa.
		
		Scanner sc = new Scanner (System.in);
		int x, y, a;
		System.out.println ("Digite um numero inteiro: ");
		x = sc.nextInt();
		System.out.println ("Digite outro numero inteiro:");
		y = sc.nextInt();
		a = x + y ;
		System.out.println ("O Resultado da soma �: " + a );
		
		sc.close();	
		
		
		
		
		

	}

}
