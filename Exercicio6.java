package exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leia = new Scanner (System.in);
	
		String nome;
		int cod;
		float novoSalario, reajuste, salario;
		
		System.out.println("\n Nome do colaborador: ");
		nome = leia.next();
		
		System.out.println("\n\t\t ** CARGOS **  ");
		System.out.println("\n1 - Gerente");
		System.out.println("\n2 - Vendedor");
		System.out.println("\n3 - Supervisor");
		System.out.println("\n4 - Motorista");
		System.out.println("\n5 - Estoquista");
		System.out.println("\n6 - Técnico de TI");
		System.out.println("\nCódigo do Cargo: ");
		cod = leia.nextInt();
		
		System.out.println("\n Salário: ");
		salario = leia.nextFloat();
		
		switch(cod){
		case 1:
			novoSalario = (float) (salario + (salario*0.10));
			System.out.printf("\n Nome do colaborador: %s \n Cargo: %d \n Salário: %.2f",nome,cod, novoSalario);
			break;
		case 2:
			novoSalario = (float) (salario + (salario*0.07));
			System.out.printf("\n Nome do colaborador: %s \n Cargo: %d \n Salário: %.2f",nome,cod, novoSalario);
			break;
		case 3:
			novoSalario = (float) (salario + (salario*0.09));
			System.out.printf("\n Nome do colaborador: %s \n Cargo: %d \n Salário: %.2f",nome,cod, novoSalario);
			break;
		case 4:
			novoSalario = (float) (salario + (salario*0.06));
			System.out.printf("\n Nome do colaborador: %s \n Cargo: %d \n Salário: %.2f",nome,cod, novoSalario);
			break;
		case 5:
			novoSalario = (float) (salario + (salario*0.05));
			System.out.printf("\n Nome do colaborador: %s \n Cargo: %d \n Salário: %.2f",nome,cod, novoSalario);
			break;
		case 6:
			novoSalario = (float) (salario + (salario*0.08));
			System.out.printf("\n Nome do colaborador: %s \n Cargo: %d \n Salário: %.2f",nome,cod, novoSalario);
			break;
		default:
			System.out.println("\nCódigo não encontrado. Tente novamente.");
			
		}
	}
}
	
