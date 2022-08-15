/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanypedro.lista3;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0, menu=0;
        
        while (menu != 9){
            System.out.println("1 - Executar operacao");
            System.out.println("9 - Sair");
            System.out.print("Menu: ");
            menu = sc.nextInt();
            
            switch (menu){
                case 1:
                    System.out.println("Informe a populacao de A: ");
                    double popA = sc.nextDouble();
                    System.out.println("Informe a taxa de crescimento anual da populacao de A: ");
                    double taxA = sc.nextDouble();

                    System.out.println("Informe a populacao de B: ");
                    double popB = sc.nextDouble();
                    System.out.println("Informe a taxa de crescimento anual da populacao de B: ");
                    double taxB = sc.nextDouble();

                    while (popA <= popB){
                        popA = popA * ((taxA + 100) / 100);
                        popB = popB * ((taxB + 100) / 100);
                        i++;
                    }

                    System.out.println("A populacao do pais A igualaria ou ultrapassaria a populacao do pais B em " + i + " anos.");
                    System.out.println();
                    break;
                
                case 9:
                    System.exit(0);
            }
        }
    }
}
