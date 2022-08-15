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
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, soma;
        float media;
        soma=0;
        i=0;
        do {
            System.out.println("Informe um valor=");
            num = sc.nextInt(); 
            soma=soma+num;
            i++;
        } while (i<5);
        media= soma/i++;
        
        System.out.println("A soma dos número é: " + soma);
        System.out.println("A media dos números é: " + media);
    }

}
