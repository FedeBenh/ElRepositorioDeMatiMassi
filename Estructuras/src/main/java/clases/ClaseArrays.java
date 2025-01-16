/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Álvaro
 */
public class ClaseArrays {

////////////////////////Recorrer array de objetos///////////////////////////
//En este caso habria una clase padre llamada Empleado
//Vendedor y JefeSeccion serian extends de Empleado
//Recorremos con foreach y comprobamos el tipo con instanceOf
    
//    Empleado[] empleados = new Empleado[3];
//    empleado[0] = new Vendedor(1, "James", "654789032");
//    empleado[1] = new Vendedor(2, "Steve", "656889459");
//    empleado[2] = new JefeSeccion(3, "Mark", "667739723");
//    
//    Vendedor vendedor;
//    JefeSeccion jefeSeccion;
//    
//    for(Empleado empleado : empleados){           //Foreach      Recorre un array de objetos
//        if (empleado instanceof Vendedor) {       //instanceOf   Comprueba si es del tipo
//            vendedor = (Vendedor)empleado;
//            vendedor.calcularComision(100);
//        }
//        if (empleado instanceof JefeSeccion) {
//            jefeSeccion = (JefeSeccion)empleado;
//            jefeSeccion.generarHorarioTurnos();
//        }
//    }
//RECUERDA!!!! En este caso Empleado empleado1 = new Trabajador();
}
