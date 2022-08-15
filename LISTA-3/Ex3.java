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
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = new String();
        String sexo = new String();
        String civil = new String();
        int idade;
        double salario;
        
        
        do {
            do {
              System.out.println("Informe um nome: ");
              nome = sc.nextLine();
            } while (nome.length() < 3);
            
            do {
              System.out.println("Informe sua idade(0-150): ");
              idade = sc.nextInt();  
            } while (idade<0 || idade>150);
            
            do {
              System.out.println("Informe seu salario (>0): ");
              salario = sc.nextFloat();
            } while (salario < 0);
            
            do {
              System.out.println("Informe seu salario (>0): ");
              salario = sc.nextFloat();
            } while (salario < 0);
            
            do {
            System.out.println("Informe seu sexo(F-M): ");
            sexo = sc.nextLine();
            } while (!(sexo.equals("M") || sexo.equals("F")));
            
            do {
            System.out.println("Informe seu estado civil(S-C-V-D): ");
            } while (!(civil.equals("S") || civil.equals("C") || civil.equals("V") || civil.equals("D")));
            
        } while (!(civil.equals("s") || civil.equals("c") || civil.equals("v") || civil.equals("d") || civil.equals("S") || civil.equals("C") || civil.equals("V") || civil.equals("D")));
    }
}
