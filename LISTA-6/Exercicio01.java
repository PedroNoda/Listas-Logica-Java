package lista06;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double vetor[] = new double[10];
		double maior=0;
		int menor = 0;
		for(int i=0; i < 10; i++) {
			System.out.println("Informe um valor: ");
			vetor[i] = sc.nextDouble();
			
			if(vetor[i] > 0) {
				maior = maior + vetor[i];
			} else if(vetor[i] < 0) {
				menor++;
			}
		}
		System.out.println("Soma dos números positivos do vetor: " + maior);
		System.out.println("Quantidades de números negativos do vetor: " + menor);
		
		sc.close();
	}
}

