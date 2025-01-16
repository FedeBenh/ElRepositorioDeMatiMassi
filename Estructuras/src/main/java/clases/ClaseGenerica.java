/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Álvaro
 */
public class ClaseGenerica<T extends Clase> { 
    //ClaseGeneriaca<Clase> generica1 = new ClaseGenerica<>();
    //Al poner el extends de clase (o super/implements) restrinjo a que los genericos se han del tipo de la clase

    private T t;

    public ClaseGenerica(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    
}
