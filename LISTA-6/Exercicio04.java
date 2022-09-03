package lista06;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = 0, n =10;
		int vetor[] = new int[10];
		int[] remover = new int[n];
 
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um valor: ");
			vetor[i] = sc.nextInt();
		}
		 
		for (int i = 0; i < n - 1; i++) {
            if (vetor[i] != vetor[i + 1]) {
            	remover[j++] = vetor[i];
            }
        }
 
        remover[j++] = vetor[n - 1];
        
        for (int i = 0; i < j; i++) {
            vetor[i] = remover[i];
        }
        
        n = j;
		
        for (int i = 0; i < n; i++) {
        	System.out.print(vetor[i] + " ");
        }
		
		sc.close();
	}
}
