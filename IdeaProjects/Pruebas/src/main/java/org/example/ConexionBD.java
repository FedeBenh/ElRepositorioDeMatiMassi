package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ConexionBD {

        private static final String URL = "jdbc:mysql://localhost:3306/productos";
        private static final String USUARIO = "root";
        private static final String CONTRASENA = "";

        public static Connection conectar() {
            Connection conexion = null;
            try {
                conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            } catch (SQLException e) {
                System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            }
            return conexion;
        }

    public void crearProducto(String nombre_producto, String categoria){
        Connection conn = conectar();
        String query = "INSERT INTO productos VALUES(?,?)";

        try {

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nombre_producto);
            ps.setString(2, categoria);
            int result = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.toString());
        } finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e2) {
                System.out.println(e2.toString());
            }
        }


    }
    public Producto leerProducto(String nombre_producto){
        Connection conn = conectar();
        String query = "SELECT * FROM productos where productos.nombre_producto = ?";

        try {

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nombre_producto);


            ResultSet result = ps.executeQuery();
            result.next();

            Producto producto = new Producto(result.getString("nombre_producto"),result.getString("categoria"));

            return producto;

        } catch (Exception e) {
            System.out.println(e.toString());
        } finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e2) {
                System.out.println(e2.toString());
            }
        }
        return null;
    }
    public void modificarProducto(String nombre_producto, String categoria, String nombre_nuevo){
        Connection conn = conectar();
        String query = "UPDATE productos SET nombre_producto = ? , categoria = ? WHERE nombre_producto = ?";

        try {

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nombre_nuevo);
            ps.setString(2, categoria);
            ps.setString(3, nombre_producto);
            int result = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.toString());
        } finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e2) {
                System.out.println(e2.toString());
            }
        }
    }
    public void eliminarProducto(String nombre_producto){
        Connection conn = conectar();
        String query = "DELETE FROM productos WHERE nombre_producto = ?";

        try {

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nombre_producto);
            int result = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.toString());
        } finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e2) {
                System.out.println(e2.toString());
            }
        }
    }

}
