package lista2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
	// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � 
	//negativo ou n�o.
		
	Scanner sc = new Scanner (System.in);
	
	int x;
	
	System.out.println("Digite um n�mero");
	x = sc.nextInt();
	
	if (x < 0) {
		System.out.println("Esse n�mero � negativo");
	}
	
	else {
		System.out.println("Esse n�mero � positivo");
	}
		
	}
}
