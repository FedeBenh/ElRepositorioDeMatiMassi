/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Comparator;

/**
 *
 * @author Álvaro
 */
public class ClaseComparator implements Comparator {

    //Exclusiva para un tipo de objeto
    @Override
    public int compare(Object o1, Object o2) {
        Clase objeto1 = (Clase) o1;
        Clase objeto2 = (Clase) o2;
        if (objeto1.getIntComparacion() < objeto2.getIntComparacion()) {
            return -1;
        } else if (objeto1.getIntComparacion() > objeto2.getIntComparacion()) {
            return 1;
        } else {
            return 0;
        }
    }
}