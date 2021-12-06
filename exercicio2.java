package lista2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
	// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner sc = new Scanner (System.in);

		int x;
		
		System.out.println("Digite um número");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Esse é um número par");
		}
		
		else {
			System.out.println("Esse número é impar");
		}

	}

}
