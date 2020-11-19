package estruturasRepetitivas;

import java.util.Scanner;

public class Comando_while_enquanto {

	public static void main(String[] args) {
		
		// COMANDO while (ENQUANTO)
		// REPETE UM BLOCO DE COMANDOS ENQUANTO UMA CONDI��O FOR VERDADEIRA.
		// USAR QUANDO N�O SE SABE PREVIAMENTE A QUANTIDADE DE REPETI��ES QUE SER� REALIZADA.
		
		// PROBLEMA EXEMPLO> Fazer um programa que l� n�meros, inteiros at� que um zero seja lido. Ao final mostra 
		// a soma dos n�meros lidos.
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println	("Resultado: " + soma);
				
		sc.close();

	}

}
