package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palavra1, palavra2, palavra3;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a primera palavra: ");
		palavra1 = leia.next();
		System.out.println("Digite a segunda palavra: ");
		palavra2 = leia.next();
		System.out.println("Digite a terceira palavra: ");
		palavra3 = leia.next();
		
		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if(palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("Aguia.");
					} else if (palavra3.equalsIgnoreCase("onivoro")) {
						System.out.println("Pomba.");
					}
				}
			} 
		
		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if(palavra2.equalsIgnoreCase("mamifero")) {
				if(palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("homem.");
					} else if (palavra3.equalsIgnoreCase("herbivoro")) {
						System.out.println("vaca.");
					}
				}
			} 
		
		if (palavra1.equalsIgnoreCase("invertebrado")) {
			if(palavra2.equalsIgnoreCase("inseto")) {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga.");
					} else if (palavra3.equalsIgnoreCase("herbivoro")) {
						System.out.println("lagarta.");
					}
				}
			} 
		if (palavra1.equalsIgnoreCase("invertebrado")) {
			if(palavra2.equalsIgnoreCase("anelideo")) {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("sanguessuga.");
					} else if (palavra3.equalsIgnoreCase("onivoro")) {
						System.out.println("minhoca.");
					}
				}
			} 
		}
	}
