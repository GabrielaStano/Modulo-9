package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numA, numB, numC,soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número A: ");
		numA = leia.nextInt();
		
		System.out.println("\nDigite o número B: ");
		numB = leia.nextInt();
		
		System.out.println("\nDigite o número C: ");
		numC = leia.nextInt();
		
		soma = numA + numB;
		
		if(soma>numC){
			System.out.println("\n A soma de A + B é maior que C.");			
		} else if (soma<numC) {
			System.out.println("\n A soma de A + B é menor que C.");
		} else {
			System.out.println("\n A soma de A + B é igual a C.");
		}
		
	}

}
