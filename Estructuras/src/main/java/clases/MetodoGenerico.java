/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Álvaro
 */
public class MetodoGenerico {

    static <T> int numeroDeNulos(T[] tabla) {
        int cont = 0;
        for (T elem : tabla) {
            if (elem == null) {
                cont++;
            }
        }
        return cont;
    }
    
}
