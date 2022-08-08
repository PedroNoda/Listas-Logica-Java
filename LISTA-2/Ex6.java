/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author labinfo
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um valor: ");
        int a = sc.nextInt();
        
        System.out.println("Informe outro valor: ");
        int b = sc.nextInt();
        
        System.out.println("Informe outro valor: ");
        int c = sc.nextInt();
        
        if (a>b && b>c) {
            System.out.println(a + "," + b + ", " + c );
        } else if (b>a && a>c) {
            System.out.println(b + "," + a + ", " + c );
        } else if (c>b && b>a) {
            System.out.println(c + "," + b + ", " + a );
        } else if (a>c && b>c) {
            System.out.println(a + "," + c + ", " + b );
        } else if (b>c && c>a) {
            System.out.println(b + "," + c + ", " + a );
        } else if (c>b && b>a) {
            System.out.println(a + "," + b + ", " + c );
        }
    }
}
