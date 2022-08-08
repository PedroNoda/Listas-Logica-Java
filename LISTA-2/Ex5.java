/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author labinfo
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.println(num*2);
        } else {
            System.out.println(num*3);
        }
    }
}
