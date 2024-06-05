package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1, num2, soma, subtracao, multiplicacao, divisao;
		int op;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Digite o 1° número: ");
		num1=leia.nextFloat();
		System.out.println("\n Digite o 2° número: ");
		num2=leia.nextFloat();
		
		System.out.println("\n\t\t ** OPERAÇÕES **  ");
		System.out.println("\n1 - Soma");
		System.out.println("\n2 - Subtração");
		System.out.println("\n3 - Multiplicação");
		System.out.println("\n4 - Divisão");
		System.out.println("\nOperação: ");
		op = leia.nextInt();

		
		switch(op) {
		case 1:
			soma = num1 + num2;
			System.out.printf("\n%.1f + %.1f = %.1f ",num1,num2, soma);
			break;
		case 2:
			subtracao = num1 - num2;
			System.out.printf("\n%.1f - %.1f = %.1f ",num1,num2, subtracao);
			break;
		case 3:
			multiplicacao = num1 * num2;
			System.out.printf("\n%.1f * %.1f = %.1f ",num1,num2, multiplicacao);
			break;
		case 4:
			divisao = num1/num2;
			System.out.printf("\n%.1f / %.1f = %.1f ",num1,num2, divisao);
			break;
		default:
			System.out.println("\nOperação inválida!");
		}
	}

}
