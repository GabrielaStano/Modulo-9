package exercicios;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int op;
		float saldo = 1000.00f;
		float valor, novoSaldo;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n\t\t ** ESCOLHA A OPERAÇÃO QUE DESEJA **  ");
		System.out.println("\n1 - Saldo");
		System.out.println("\n2 - Saque");
		System.out.println("\n3 - Depósito");
		System.out.println("\nOperação: ");
		op = leia.nextInt();
		
		switch(op) {
		case 1: 
			System.out.printf("Operaçao - Saldo \n Saldo: R$ %.2f", saldo);
		break;
		
		case 2:
			System.out.println("\n Valor: ");
			valor = leia.nextFloat();
		if(saldo>valor || saldo == valor) {
			novoSaldo = saldo - valor;
			System.out.println("\nOperação - Saque");
			System.out.printf("\nNovo Saldo: %.2f", novoSaldo);
		}else{
			System.out.println("\n Opração - Saque \nSaldo Insuficiente!");
		}
		break;
		
		case 3:
			System.out.println("\n Valor: ");
			valor = leia.nextFloat();
			novoSaldo = saldo + valor;
			System.out.println("\nOperação - Depósito");
			System.out.printf("\nNovo Saldo: %.2f", novoSaldo);			
		break;
		default:
			System.out.println("\nOperação inválida!");
			
		}
		
	}
}
