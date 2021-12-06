package lista2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
	/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a 
	 * quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
	 */

		Scanner sc = new Scanner (System.in);
		
		int codigo, quantidade;
		double valor;
		
		System.out.println("Código do produto: ");
		codigo = sc.nextInt();
		
		System.out.println("Quantidade: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			valor = quantidade * 4;
		}
		
		else if (codigo == 2) {
			valor = quantidade * 4.5;
		}
		
		else if (codigo == 3) {
			valor = quantidade * 5;
		}
		
		else if (codigo == 4) {
			valor = quantidade * 2;
		}

		else {
			valor = quantidade * 1.5;
		}
		
		System.out.printf("Total a pagar: %.2f ", valor);
	}
}
