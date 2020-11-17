package comandosbasicos;

import java.util.Locale;
import java.util.Scanner;

public class Exer4_CalcularSalarioFuncionario {

	public static void main(String[] args) {
		// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		// teste
		
		Locale.setDefault(Locale.US); //DECLARANDO O PADRÃO DE TECLADO AMERICANO
		Scanner sc = new Scanner (System.in); //INICIANDO COMANDO PARA ENTRADA DE DADOS
		
		double  HorasTrabalhada, ValorHora, TotalRecebido;
		int ID_Funcionario;
		
		System.out.println ("Digite o ID do funcionario: "); //EXIBINDO MENSAGEM NA TELA
		ID_Funcionario = sc.nextInt(); //ATRIBUINDO O VALOR DIGITADO ACIMA PARA VARIAVEL ID_Funcionario
		
		System.out.println ("Digite a quantidade de horas trabalhadas: "); //EXIBINDO MENSAGEM NA TELA
		HorasTrabalhada = sc.nextDouble(); //ATRIBUINDO O VALOR DIGITADO ACIMA PARA VARIAVEL ID_Funcionario
		
		System.out.println ("Digite o Valor recebido por hora: "); //EXIBINDO MENSAGEM NA TELA
		ValorHora = sc.nextDouble(); //ATRIBUINDO O VALOR DIGITADO ACIMA PARA VARIAVEL ID_Funcionario
		
		TotalRecebido = ValorHora * HorasTrabalhada;
		System.out.println ("ID Funcionario: " + ID_Funcionario); // "E o seu salario é: %.2f%n" + TotalRecebido);
		System.out.printf("Salario Funcionario: R$ %.2f%n", TotalRecebido);
		
		
		sc.close();

	}

}
