package lista2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo,
		 *  sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo uma 
		 *  dura��o m�nima de 1 hora e m�xima de 24 horas.
		*/
		
		Scanner sc = new Scanner (System.in);
		
		int inicio, fim, duracao; 
		
		System.out.println("Hora inicial do jogo: ");
		inicio = sc.nextInt();
		
		System.out.println("Hora do final do jogo: ");
		fim = sc.nextInt();
		
		if (inicio < fim) {
			duracao = fim - inicio;
		}
		else {
			duracao = 24 - inicio + fim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
		
	}

}
