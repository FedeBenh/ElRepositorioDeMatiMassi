/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Álvaro
 */
public class ExcepcionDivisionPorCero extends Exception {

    @Override
    public String toString() {
        return "División por 0.";
    }
    //Este seria su trycatch que la llama y estaria por encima
//    try {
//            System.out.print("Indique un número ");
//            int num1 = scan.nextInt();
//            System.out.print("Indique otro número ");
//            int num2 = scan.nextInt();
//            if (num2 == 0) {
//                throw new ExcepcionDivisionPorCero();
//            } 
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
}
