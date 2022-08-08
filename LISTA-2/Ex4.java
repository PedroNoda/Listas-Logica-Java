/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author labinfo
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        
        System.out.println("Informe um valor para A: ");
        int a = sc.nextInt();
        
        System.out.println("Informe um vlaor para B: ");
        int b = sc.nextInt();
        
        if (a==b) {
            c=a+b;
            System.out.println(c);
        } else {
            c=a*b;
            System.out.println(c);
        }
        
    }
}
