package org.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    String nombre;
    List<String> codigos = new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
