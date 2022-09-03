package lista06;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Infrome o valor "+ i +" : ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Elementos duplicados no vetor: ");
		
		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (vetor[i] == vetor[j])
					System.out.printf("%d, ",vetor[j]);
			}
		}
		sc.close();
	}
}
