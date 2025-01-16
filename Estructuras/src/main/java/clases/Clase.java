/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Álvaro
 */
public class Clase extends ClaseAbstracta implements Interfaz, Comparable {

    int intComparacion;

    public Clase(int intComparacion) {
        this.intComparacion = intComparacion;
    }

    public Clase(int intComparacion, int prueba) {
        super(prueba);
        this.intComparacion = intComparacion;
    }

    public int getIntComparacion() {
        return intComparacion;
    }

    public void setIntComparacion(int intComparacion) {
        this.intComparacion = intComparacion;
    }

    //Metodo de la clase abstracta
    @Override
    public double calcularSuma() {
        return prueba + prueba; //Puedo llamar a las variables de la clase "Principal de la que se extiende"
    }

    //Metodo de la interfaz
    @Override
    public void metodoInterfaz(double prueba) {//Los hago public para que se pueda hacer uso desde fuera
        prueba = 2;
    }

    //Comparable
    @Override
    public int compareTo(Object o) {
        Clase claseParametro = (Clase) o;
        if (intComparacion < claseParametro.getIntComparacion()) {
            return -1;
        } else if (intComparacion > claseParametro.getIntComparacion()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Esto es una prueba " + prueba;
    }
}
