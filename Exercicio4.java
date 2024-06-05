package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palavra1, palavra2, palavra3;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite as características do animal: ");
		palavra1 = leia.next();
		palavra2 = leia.next();
		palavra3 = leia.next();
		
		if ("vertebrado".equalsIgnoreCase(palavra1)) {
			if("ave".equalsIgnoreCase(palavra2)) {
				if("carnivoro".equalsIgnoreCase(palavra3)) {
					System.out.println("Aguia.");
					} else if ("onivoro".equalsIgnoreCase(palavra3)) {
						System.out.println("Pomba.");
					}
				}
			} 
		
		if ("vertebrado".equalsIgnoreCase(palavra1)) {
			if("mamifero".equalsIgnoreCase(palavra2)) {
				if("onivoro".equalsIgnoreCase(palavra3)) {
					System.out.println("homem.");
					} else if ("herbivoro".equalsIgnoreCase(palavra3)) {
						System.out.println("vaca.");
					}
				}
			} 
		
		if ("invertebrado".equalsIgnoreCase(palavra1)) {
			if("inseto".equalsIgnoreCase(palavra2)) {
				if("hematofago".equalsIgnoreCase(palavra3)) {
					System.out.println("pulga.");
					} else if ("herbivoro".equalsIgnoreCase(palavra3)) {
						System.out.println("lagarta.");
					}
				}
			} 
		if ("invertebrado".equalsIgnoreCase(palavra1)) {
			if("anelideo".equalsIgnoreCase(palavra2)) {
				if("hematofago".equalsIgnoreCase(palavra3)) {
					System.out.println("sanguessuga.");
					} else if ("onivoro".equalsIgnoreCase(palavra3)) {
						System.out.println("minhoca.");
					}
				}
			} 
		}
	}
