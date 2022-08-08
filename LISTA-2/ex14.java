
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class ex14 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de lados do poligono regular: ");
        int lados = sc.nextInt();
        
        if (lados < 3){
            System.out.println("NAO É UM POLIGONO.");
            System.exit(0);
        } else if (lados > 5){
            System.out.println("POLIGONO NAO IDENTIFICADO.");
            System.exit(0);
        }
        
        System.out.println("Informe a medida d lado (cm): ");
        double medida = sc.nextInt();
        
        if (lados == 3){
            System.out.println("TRIANGULO, area: " + df.format((medida * Math.sqrt(medida * medida - ((medida/2) * (medida/2)))) / 2));
        } else if (lados == 4){
            System.out.println("QUADRADO, area: " + (medida * medida));
        } else if (lados == 5){
            System.out.println("PENTAGONO, area: " + df.format(1.72 * medida * medida));
        }
    }
}