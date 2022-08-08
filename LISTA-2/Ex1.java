/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author labinfo
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o valor de A: ");
        int a = teclado.nextInt();
        System.out.println("Informe o valor de B: ");
        int b = teclado.nextInt();
        System.out.println("Informe o valor de C: ");
        int c = teclado.nextInt();
        
        if (a+b < c) {
            System.out.println("A+B é menor que C");
        } else {
            System.out.println("A+B é maior que C");
        }
    }
   
}
