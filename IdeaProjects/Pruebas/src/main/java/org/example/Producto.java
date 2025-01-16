package org.example;

public class Producto {
    String nombre_producto;
    String categoria;

    public Producto(String nombre_producto, String categoria) {

        this.nombre_producto = nombre_producto;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
}
