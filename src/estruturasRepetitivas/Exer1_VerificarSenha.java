package estruturasRepetitivas;

import java.util.Scanner;

public class Exer1_VerificarSenha {

	public static void main(String[] args) {
		//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		
		Scanner sc = new Scanner (System.in);
			
		int password;
		
		System.out.println ("Type the Password / Digite a senha: ");
		password = sc.nextInt ();
		
		while (password != 2002)	{		
		System.out.println ("Incorrect Password / Senha incorreta");	
		System.out.println ("Type the password again / Digite a senha novamente: ");
		password = sc.nextInt();
		}
		
		System.out.println ("Access Allowed / Acesso Permitido");		
				
		sc.close();		

	}

}
