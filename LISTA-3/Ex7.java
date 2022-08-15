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
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, maior;
        i=1;
        maior=0;
        
        do {
            System.out.println("Informe um valor=");
            num = sc.nextInt();
              if (num > maior){
                maior=num; 
              } 
            i++;
        } while (i<=5);
        
        System.out.println("O maior entre os numeros é: " + maior);
    }
}
