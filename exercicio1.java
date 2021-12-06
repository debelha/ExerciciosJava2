package lista2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
	// Fazer um programa para ler um número inteiro, e depois dizer se este número é 
	//negativo ou não.
		
	Scanner sc = new Scanner (System.in);
	
	int x;
	
	System.out.println("Digite um número");
	x = sc.nextInt();
	
	if (x < 0) {
		System.out.println("Esse número é negativo");
	}
	
	else {
		System.out.println("Esse número é positivo");
	}
		
	}
}
