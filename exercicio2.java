package lista2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
	// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		
		Scanner sc = new Scanner (System.in);

		int x;
		
		System.out.println("Digite um n�mero");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Esse � um n�mero par");
		}
		
		else {
			System.out.println("Esse n�mero � impar");
		}

	}

}
