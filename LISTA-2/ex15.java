
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        double ang[] = new double[3];
        
        System.out.println("Informe o primeiro angulo do triangulo: ");
        ang[0] = sc.nextDouble();
        
        System.out.println("Informe o segundo angulo do triangulo: ");
        ang[1] = sc.nextDouble();
        
        System.out.println("Informe o terceiro angulo do triangulo: ");
        ang[2] = sc.nextDouble();
        
        if (ang[0] + ang[1] + ang[2] != 180){
            System.out.println("Os angulos nao formam um triangulo");
            System.exit(0);
        }
        
        for (int i=0; i<3; i++){
            if (ang[i] == 90){
                System.out.println("O triangulo é retangulo.");
                System.exit(0);
            } else if (ang[i] > 90){
                System.out.println("O triangulo é obtusangulo");
            } else if (ang[i] < 90){
                a++;
                if (a == 3){
                    System.out.println("O triangulo é acutangulo");
                }
            }
        }
    }
}