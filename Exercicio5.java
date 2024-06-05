package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cod,  quantidade;
		float valorTotal;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\t ** PRODUTOS **  ");
		System.out.println("\n1 - Cachorro-quente");
		System.out.println("\n2 - X-Salada");
		System.out.println("\n3 - X-Bacon");
		System.out.println("\n4 - Bauru");
		System.out.println("\n5 - Refrigerante");
		System.out.println("\n6 - Suco de laranja");
				System.out.println("\nCódigo do Produto: ");
		cod = leia.nextInt();
		
		System.out.println("Quantidade: ");
		quantidade = leia.nextInt();
		
		switch(cod) {
		
		case 1:
			valorTotal = (float) (quantidade*10.00);
			System.out.printf("\nProduto: Cachorro-quente \nValor total: R$ %.2f",valorTotal);
			break;
		case 2:
			valorTotal = (float) (quantidade*15.00);
			System.out.printf("\nProduto: X-Salada \nValor total: R$ %.2f", valorTotal);
			break;
		case 3:
			valorTotal = (float) (quantidade*18.00);
			System.out.printf("\nProduto: X-Bacon \nValor total: R$ %.2f", valorTotal);
			break;
		case 4:
			valorTotal = (float) (quantidade*12.00);
			System.out.printf("\nProduto: Bauru \nValor total: R$ %.2f",valorTotal);
			break;
		case 5:
			valorTotal = (float) (quantidade*8.00);
			System.out.printf("\nProduto: Refrigerante \nValor total: R$ %.2f",valorTotal);
			break;
		case 6:
			valorTotal = (float) (quantidade*13.00);
			System.out.printf("\nProduto: Suco de laranja \nValor total: R$ %.2f", valorTotal);
			break;
			default:
				System.out.println("\nOpção inválida. Tente novamente.");
		}
			
	}

}
