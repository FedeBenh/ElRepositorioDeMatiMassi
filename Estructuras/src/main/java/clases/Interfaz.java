/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clases;

/**
 *
 * @author Álvaro
 */
public interface Interfaz {
    //Sus metodos deben ser public igual que los que la sobrescriben
    
    //Las interfaces son simplemente plantillas. Sus metodos son abstractos por defecto
    //Y si tienen variables son CONSTANTES 
    double PRUEBAINTERFAZ = 1;

    //Puede tener metodos staticos los cuales no habra que hacer @Override
    public static double metodoStatic(double valor) {
        return PRUEBAINTERFAZ + PRUEBAINTERFAZ;
    }

    public void metodoInterfaz(double prueba);
}
