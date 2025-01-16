/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.estructuras;

import clases.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Álvaro
 */
public class Estructuras {

    public static void main(String[] args) {
        //AÑADIR CLASES PARA USO DE FECHAS Y HORAS
        System.out.print("Adios mundo :)");

        //Pruebas
//        Clase clase1 = new Clase(1);
//        ClaseGenerica<Clase> generica1 = new ClaseGenerica<>(clase1);

        //Pruebas Comparator para ordenar listas
        List<Clase> lista = new ArrayList<>();
        lista.add(new Clase(124, 124));
        lista.add(new Clase(123, 123));
        lista.add(new Clase(123, 123));
        //Collections.sort(lista, new ClaseComparator());
        lista.sort(new ClaseComparator());
        System.out.println(lista.toString());
        //sout + tab 
        //trycatch + tab 
        
    }
}
