package lista2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
	/* Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem 
	 "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o m�ltiplos 
	 entre si. Aten��o: os n�meros devem poder ser digitados em ordem crescente ou decrescente.
	*/
		
		Scanner sc = new Scanner (System.in);
		
		int A, B; 
		
		System.out.println("Digite o primeiro n�mero");
		A = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		B = sc.nextInt();
		
		if (A % B == 0) {
			System.out.println("S�o m�ltiplos");
		}
		
		else if (B % A == 0) {
			System.out.println("S�o m�ltiplos");
		}
		
		else {
			System.out.println("N�o s�o m�ltiplos");
		}
		
		sc.close();
	}

}
