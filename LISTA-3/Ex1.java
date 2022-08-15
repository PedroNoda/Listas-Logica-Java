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
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota=1;
        
        do {
        System.out.println("Informe uma nota 1-10");
        nota = sc.nextInt();
        if (nota < 10 && nota > 0) {
            System.out.println("Nota registrada");
        } else {
            System.out.println("Nota Inválida!");
        } 
        } while (nota > 10 || nota < 0); 
        
        
           
       
        
        
    }
}
