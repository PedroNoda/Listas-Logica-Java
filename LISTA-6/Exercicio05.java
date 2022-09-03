package lista06;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[5];
		int menu;
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um valor: ");
			vetor[i] = sc.nextInt();
		}
		
		do {
			System.out.println("1-Mostrar vetor na ordem direta");
			System.out.println("2-Mostrar vetor na ordem inversa: ");
			System.out.println("0-SAIR");
			menu = sc.nextInt();
			if (menu == 1) {
				for (int j = 0; j < 5; j++) {
					System.out.printf("%d, ", vetor[j]);
				}
				System.out.println(" ");
			}else if (menu == 2) {
				for (int j = 4; j > -1; j--) {
					System.out.printf("%d, ", vetor[j]);
				}
				System.out.println(" ");	
			}else if(menu == 0) {
				System.exit(0);
			}else {
				System.out.println("Alternativa Inválida");
			}
		} while(menu != 0);
		
		sc.close();
	}
}
