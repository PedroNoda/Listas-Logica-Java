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
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario = new String();
        String senha = new String();
        
        do {
        System.out.println("Informe um nome de usuário: ");
        usuario = sc.nextLine();
        System.out.println("Informe uma senha: ");
        senha = sc.nextLine();
        if(usuario.equals(senha)){
            System.out.println("CADASTRO INVALIDO!");
        } else {
            System.out.println("Cadastrado com sucesso!");
        }
            
        } while (usuario.equals(senha));
    }
}
