package lista06;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int [10];
		int num;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um valor: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Informe um valor para verificar multiplos: ");
		num = sc.nextInt();
		
		
		System.out.println("Multiplos de " + num+ " dentro do vetor: ");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] % num == 0) {
				System.out.printf("%d, ", vetor[i]);
			}
		}
		sc.close();
	}
}
