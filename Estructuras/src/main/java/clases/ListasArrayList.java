/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Álvaro
 */
public class ListasArrayList {
    //Usar Integer Double Character
    
    ///////////////CREAR LISTA///////////////
    List<Clase> lista = new ArrayList<>();
    Clase clase1 = new Clase(123, 123);

    ///////////////AÑADIR LISTA///////////////
    /*
    lista.add(clase1);    //Añadir al final
    lista.add(1, clase1); //Añadir en posición determinada
     */
    
    
    ///////////////DEVOLVER VALOR LISTA///////////////
    /*
    lista.get(1);         //Devolver una posición determinada
    lista.add(1, clase1); //Añadir en posición determinada
     */
    
    
    ///////////////SUSTITUIR VALOR LISTA///////////////
    /*
    lista.set(1, clase1);   //Sustituir un valor de una posicion
     */
    
    
    ///////////////BUSCAR VALOR LISTA///////////////
    /*
    lista.indexOf("25"); // {"10", "55", "25", "30"} devolverá 2
    lista.lastIndexOf("30");// {"30", "55", "25", "30"} devolverá 3
    lista.contains("75");
     */
    
    
    ///////////////BORRAR EN LISTA///////////////
    /*
    lista.remove(0);                    //Posicion a eliminar
    lista.remove("30");                 //Valor a eliminar
    lista.remove(Integer.valueOf(5));   //Lo paso a Objeto
     */
    
    
    ///////////////LIMPIAR LISTA///////////////
    /*
    lista.clear();
     */
    
    
    ///////////////COMPROBAR SI ESTA VACIA///////////////
    /*
    lista.isEmpty(); //devolverá true su está vacía, false en caso contrario
     */
    
    
    ///////////////COMPROBAR TAMAÑO///////////////
    /*
    lista.size();
     */
    
    
    ///////////////CREACIÓN DE UNA LISTA Y ORDENACION USANDO LA CLASE COMPARATOR///////////////
    /*
    List <Clase> lista = new ArrayList<>();
    Clase clase1 = new Clase(123,123);
    Clase clase2 = new Clase(123,123);
    Clase clase3 = new Clase(123,123);
    lista.add(clase1);
    lista.add(clase2);
    lista.add(clase3);
    Collections.sort(lista, new ClaseComparator());
                    o
    lista.sort(new ClaseComparator());
    System.out.println(lista.toString());
    */
}
