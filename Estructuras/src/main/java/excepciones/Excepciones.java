/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Álvaro
 */
public class Excepciones {
    
    
    //Metodo que implementa una excecion que lanzara a mas arriba (Debe ser llamado en un trycatch)
        public static void recogerDatos() throws NumberFormatException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Indique un número entero");
        int num1 = scan.nextInt();
        System.out.println("Indique un número entero");
        int num2 = scan.nextInt();
        System.out.println("Indique un número entero");
        int num3 = scan.nextInt();
        System.out.println("Indique un número entero");
        int num4 = scan.nextInt();
    }
    
    //Uso de una excepcion concreta
//    try {
//            System.out.println("Indique un número entero");
//            int num1 = scan.nextInt();
//            System.out.println("Indique un número entero");
//            int num2 = scan.nextInt();
//            System.out.println("Indique un número entero");
//            int num3 = scan.nextInt();
//            System.out.println("Indique un número entero");
//            int num4 = scan.nextInt();
//            System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + "= " + (num1 + num2 + num3 + num4));
//        } catch (InputMismatchException e) { //Indicamos la excepcion que vamos a capturar
//            e.printStackTrace();
//        }
    
}
