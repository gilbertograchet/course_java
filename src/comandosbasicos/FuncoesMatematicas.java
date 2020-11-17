package comandosbasicos;

public class FuncoesMatematicas {

	public static void main(String[] args) {
		
		// FUNÇÕES MATEMATICAS

		double x = 3.0; // DECLARANDO VARIAVEIS
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		A = Math.sqrt(x); // COMANDO Math.sqrt PARA DIZER QUE A VARIAVEL 'A' RECEBE A RAIZ QUADRADA DO VALOR CONTIDO NA VARIAVEL 'x'
		B = Math.sqrt(y); // COMANDO Math.sqrt PARA DIZER QUE A VARIAVEL 'B' RECEBE A RAIZ QUADRADA DO VALOR CONTIDO NA VARIAVEL 'y'
		C = Math.sqrt(25.0); // COMANDO Math.sqrt PARA DIZER QUE A VARIAVEL 'C' RECEBE A RAIZ QUADRADA DO VALOR FIXADO APÓS O COMANDO
		System.out.println("Raiz quadrada de " + x + " = " + A); // COMANDO PARA EXIBIR O RESULTADO
		System.out.println("Raiz quadrada de " + y + " = " + B); // COMANDO PARA EXIBIR O RESULTADO
		System.out.println("Raiz quadrada de 25 = " + C); // COMANDO PARA EXIBIR O RESULTADO
		
		A = Math.pow(x, y); // COMANDO PARA CONTAS DE ELEVAÇÃO NESTE EXEMPLO: VALOR DA VARIAVEL 'X' ELEVADO AO VALOR DA VARIAVEL 'Y'
		B = Math.pow(x, 2.0); // COMANDO PARA CONTAS DE ELEVAÇÃO NESTE EXEMPLO: VALOR DE 'X' ELEVADO AO VALOR FIXADO APÓS O COMANDO
		C = Math.pow(5.0, 2.0); // COMANDO PARA CONTAS DE ELEVAÇÃO NESTE EXEMPLO: 5 ELEVADO A 2 POTENCIA.
		System.out.println(x + " elevado a " + y + " = " + A); // EXIBIR RESULTADO NA TELA
		System.out.println(x + " elevado ao quadrado = " + B); // EXIBIR RESULTADO NA TELA
		System.out.println("5 elevado ao quadrado = " + C); // EXIBIR RESULTADO NA TELA
		
		A = Math.abs(y); // COMANDO PARA MOSTRAR O VALOR ABSOLUTO (RETIRAR O NEGATIVO DE UM NUMERO)
		B = Math.abs(z); // COMANDO PARA MOSTRAR O VALOR ABSOLUTO (RETIRAR O NEGATIVO DE UM NUMERO)
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}
}
