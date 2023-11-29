/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el multiplicando");
        int n = entrada.nextInt();
        System.out.println("Ingrese el multiplicador");
        int m = entrada.nextInt();
        int c = 1;
        int total = 0;
        do {
            n = n * 2;
            if ((c % 2) == 1) {
                total = total + n;
            }
            m = m / 2;
            c++;
        } while (m != 1);
        System.out.println("El resultado es: " + total);
    }

}
