package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 18 a 69 - pode doar sangue
		// 60 a 69 - só pode doar se não for a primeira doacao
		// entrada: nome,(string) idade(inteiro), primeira doacao (boolean)
		// Saidas: Se esta apto pu não para doar.
		
		int idade;
		String nome;
		boolean doacao;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o nome do doador: ");
		nome = leia.next();
		
		System.out.print("\nDigite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("\nPrimeira doação de sangue (sim ou não): ");
		doacao = leia.nextBoolean();
		
		if(idade >= 60 && idade<70 && doacao == true) {
			System.out.println("\n" + nome +" não está apto(a) para doar sangue!");
		} else if (idade >= 18 && idade<60 ) {
			System.out.println("\n" + nome +" está apto(a) para doar sangue!");
		} else if (idade >= 60 && idade<70 && doacao == false){
			System.out.println("\n" + nome +" está apto(a) para doar sangue!");
		} else {
			System.out.println("\n"+ nome + " não está apto(a) para doar sangue!");
		}
	}
}
