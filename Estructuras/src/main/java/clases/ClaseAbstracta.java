/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Álvaro
 */
abstract class ClaseAbstracta {

    //Esta clase es como hacer un extends de otra clase pero obliga a hacer @Override de sus metodos
    //Se entiende que al crear una de estas todos sus metodos se van a sobrescribir
    //Funciona a modo de plantilla
    protected int prueba;

    public ClaseAbstracta() {
        this.prueba = 1;
    }

    public ClaseAbstracta(int prueba) {
        this.prueba = prueba;
    }

    //Metodo para hacer @Override en sus extends
    abstract double calcularSuma();

    public int getPrueba() {
        return prueba;
    }

    public void setPrueba(int prueba) {
        this.prueba = prueba;
    }

    
}
