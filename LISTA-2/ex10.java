
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do primeiro lado: ");
        int x = sc.nextInt();
        System.out.println("Informe o valor do segundo lado: ");
        int y = sc.nextInt();
        System.out.println("Informe o valor do terceiro lado");
        int z = sc.nextInt();
        
        if (x==z & x==y) {
            System.out.println("Triangulo equilatero");
        } else if ((x==z & x!=y) || (x==y & x!=z) || (z==y & z!=x)) {
            System.out.println("Triangulo Isócele"); 
        } else if ((x!=z & x!=y)) {
            System.out.println("Triângulo Escaleno");
        }
    }
}
