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
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, num1, num2, o;
        o=0;
        System.out.println("Informe um valor: ");
        num1 = sc.nextInt();
        System.out.println("Informe um valor: ");
        num2 = sc.nextInt();
        
        if (num1 > num2) {
            o = num1;
            num2 = num1;
            num1 = o;
        }
        
        i=num1;
        do {
            i++;
            System.out.print(i + " ");
        }
        while (i<num2-1);
        
    }
}
