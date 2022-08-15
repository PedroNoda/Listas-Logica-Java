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
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        double A = 8000;
        double B = 20000;
        
        do {
            A = A * 1.03;
            B = B * 1.015;
            i++;  
        } while(A <= B);
     System.out.println("A populacao dos paises se igualariam em " + i + " anos.");    
    }
}
