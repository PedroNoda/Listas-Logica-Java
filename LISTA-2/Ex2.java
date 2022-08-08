/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author labinfo
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = new String();
        String sexo = new String();
        String estadocivil = new String();
        
        System.out.println("Qual o seu nome?: ");
        nome = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Qual seu Sexo?(M - F): ");
        sexo = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Qual seu estado civil (SOLTEIRA - CASADA)");
        estadocivil = teclado.nextLine();
        teclado.nextLine();
        
        if ("CASADA".equals(estadocivil) && "F".equals(sexo)) {
            System.out.println("Olá, casada. Quanto tempo de casada?: ");
            int idadecasada = teclado.nextInt();
        } else {
            System.out.println("TENHA UM BOM DIA!");
    } 
        
        
        
        
        
        
        
    }
    
}
