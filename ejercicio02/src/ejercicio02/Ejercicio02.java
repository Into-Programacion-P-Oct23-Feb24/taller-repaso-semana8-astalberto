/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
        int c = 1;
        System.out.println("Ingrese un numero natural que sea positivo y par");
        n = entrada.nextInt();
        if (((n % 2) == 0) && (n > 0)) {
            while (c <= n) {
                System.out.println(c);
                c++;
            }
        } else {
            System.out.println("El numero ingresado no es positivo o no es par");
        }
    }

}
