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
public class Ex10 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.print("Informe um valor inteiro: ");
        int valor1 = sc.nextInt();
        
        System.out.print("Informe um valor inteiro: ");
        int valor2 = sc.nextInt();
        
        if (valor1 > valor2){
            a = valor1;
            valor1 = valor2;
            valor2 = a;
        }
        
        System.out.print("O intervalor entre " + valor1 + " e " + valor2 + " é: ");
        
        for (int i=(valor1+1); i<valor2; i++){
            System.out.print(i + ", ");
        }
    } 
}
