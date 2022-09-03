package lista06;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double vetor[] = new double[5];
		double maior=0;
		double menor = 0;
		double soma = 0;
		
		for(int i=0; i<5; i++) {
			System.out.println("Informe um valor: ");
			vetor[i] = sc.nextDouble();
			if(i==0) {
				maior = maior + vetor[i];
				menor = menor + vetor[i];
			}
			if (vetor[i] > maior) {
				maior = vetor[i];
			} else if (vetor[i] < menor) {
				menor = vetor[i];
			}
			
			soma = (soma + vetor[i]);
		}
		System.out.println("Elementos do vetor");
		for(int i = 0; i<5; i++) {
			System.out.printf("%.1f; ", vetor[i]);
		}
		System.out.println(" ");
		
		System.out.println("Maior número do vetor: " + maior);
		System.out.println("Menor número do vetor: " + menor);
		System.out.println("A media dos valores é: " + (soma/5) );
		
		sc.close();
	}
}