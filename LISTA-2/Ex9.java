/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author labinfo
 */
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sexo = new String();
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("Altura(metros)? :");
        double altura = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Seu sexo(M ou F)");
        sexo = sc.nextLine();
        
        
        if ("M".equals(sexo)) {
            System.out.println("Seu peso ideal é: " + df.format(((72.7*altura)-58))); 
        } else if ("F".equals(sexo)) {
            System.out.println("Seu peso ideal é: " + df.format(((62.1*altura)-44.7)));
        }
        
    }
}
