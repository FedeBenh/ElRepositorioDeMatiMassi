package org.example;

import java.util.Scanner;

public class CRUD {

    public void correr_crud(){
        Scanner scan = new Scanner(System.in);
        ConexionBD conn =  new ConexionBD();
        boolean bandera = false;
        String operacion = "";
        String nombre_producto = "";
        String categoria = "";
        String nombre_nuevo = "";
        do{
            System.out.println("Dime que operacion quieres hacer");
            System.out.println("1-Crear");
            System.out.println("2-Leer");
            System.out.println("3-Modificar");
            System.out.println("4-Eliminar");
            System.out.println("0-Salir");
            operacion = scan.next();

            switch (operacion){
                case "1" :
                    System.out.println("Dime el nombre del producto");
                    nombre_producto = scan.next();
                    System.out.println("Dime el nombre de la categoria");
                    categoria = scan.next();

                    conn.crearProducto(nombre_producto,categoria);
                    break;
                case "2" :
                    System.out.println("Dime el nombre del producto que quieres leer.");
                    nombre_producto = scan.next();

                    Producto producto = conn.leerProducto(nombre_producto);


                    System.out.println(producto.getNombre_producto());
                    System.out.println(producto.getCategoria());

                    break;
                case "3" :
                    System.out.println("Dime el nombre del producto que quieres modificar");
                    nombre_producto = scan.next();
                    System.out.println("Dime el nuevo nombre del producto");
                    nombre_nuevo = scan.next();
                    System.out.println("Dime la categoria del producto");
                    categoria = scan.next();

                    conn.modificarProducto(nombre_producto,categoria,nombre_nuevo);
                    break;
                case "4" :
                    System.out.println("Dime el nombre del producto que quieres eliminar");
                    nombre_producto = scan.next();

                    conn.eliminarProducto(nombre_producto);
                    break;
                case "0" :
                    bandera = true;
                    break;
            }

        }while(bandera == false);
    }
}
