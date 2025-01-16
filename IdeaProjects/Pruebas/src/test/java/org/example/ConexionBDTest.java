package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConexionBDTest {
    ConexionBD conn = new ConexionBD();
    @Test
    void crearProducto() {


        String nombre = "ProductoTest";
        String categoria = "CategoriaTest";

        conn.crearProducto(nombre, categoria);

        Producto producto = conn.leerProducto(nombre);
        assertNotNull(producto);
        assertEquals(nombre, producto.getNombre_producto());
        assertEquals(categoria, producto.getCategoria());
    }

    @Test
    void leerProducto() {
        String nombre = "ProductoTest";
        String categoria = "CategoriaTest";

        Producto producto = conn.leerProducto(nombre);

        assertNotNull(producto);
        assertEquals(nombre, producto.getNombre_producto());
        assertEquals(categoria, producto.getCategoria());
    }

    @Test
    void modificarProducto() {
        String nombre = "CategoriaNuevaTest";
        String nombreNuevo = "ProductoTest2";
        String categoria = "CategoriaTest";


        conn.modificarProducto(nombre,categoria,nombreNuevo);

        Producto producto = conn.leerProducto(nombreNuevo);

        assertNotNull(producto);
        assertEquals(nombreNuevo, producto.getNombre_producto());
        assertEquals(categoria, producto.getCategoria());

    }

    @Test
    void eliminarProducto() {
        String nombreNuevo = "ProductoTest22";
        String categoria = "CategoriaTest2";

        conn.crearProducto(nombreNuevo,categoria);
        conn.eliminarProducto(nombreNuevo);

        Producto producto = conn.leerProducto(nombreNuevo);
        assertNull(producto);
    }
}