/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Álvaro
 */
public class bd {

    public static DefaultTableModel leerDB() {
        DefaultTableModel modelo = new DefaultTableModel(); //Modelo de tabla que devuelvo con los datos
        modelo.setColumnCount(4);
        String[] cabeceras = {"Título", "Artista", "Año", "Género"};
        modelo.setColumnIdentifiers(cabeceras);

        String cadenaConexion
                = "jdbc:mysql://localhost:3306/música";
        String consulta
                = "SELECT * FROM discos ";
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(cadenaConexion, "root", "");

            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                Object[] filaTemp = {result.getString("titulo"), result.getString("artista"), result.getInt("anio"), result.getString("genero")};
                modelo.addRow(filaTemp);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e2) {
                System.out.println(e2.toString());
                return null;
            }
        }
        return modelo;
    }

    public static void insertarRegistroDB(String titulo, String artista, int anio, String genero) {
        String cadenaConexion
                = "jdbc:mysql://localhost:3306/música";
        String consulta = "INSERT INTO discos (titulo, artista, anio, genero) VALUES (?, ?, ?, ?)";
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(cadenaConexion, "root", "");
            conexion.setAutoCommit(false);//Lo hago como transaccion porque soy asi de chulo y me parece mas adecuado

            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.setString(1, titulo);
            ps.setString(2, artista);
            ps.setInt(3, anio);
            ps.setString(4, genero);
            int result = ps.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            System.out.println(e.toString());
            try {
                if (conexion != null) { //En caso de fallo 
                    conexion.rollback();
                }
            } catch (Exception e1) {
                System.out.println(e1.toString());
            }
        } finally {
            try {
                if (conexion != null) { //Cierro conexion
                    conexion.close();
                }
            } catch (Exception e2) {
                System.out.println(e2.toString());
            }
        }
    }

    public static void actualizarRegistroDB(String titulo, String artista, int anio, String genero, String lastTitulo, String lastArtista) {
        String cadenaConexion
                = "jdbc:mysql://localhost:3306/música";
        String consulta = "UPDATE discos SET titulo=?, artista=?, anio=?, genero=? WHERE titulo=? and artista=?"; //Doy por hecho que un artista no tiene dos canciones con el mismo nombre
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(cadenaConexion, "root", "");
            conexion.setAutoCommit(false);//Lo hago como transaccion porque soy asi de chulo y me parece mas adecuado

            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.setString(1, titulo);
            ps.setString(2, artista);
            ps.setInt(3, anio);
            ps.setString(4, genero);
            ps.setString(5, lastTitulo);
            ps.setString(6, lastArtista);
            int result = ps.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            System.out.println(e.toString());
            try {
                if (conexion != null) { //En caso de fallo 
                    conexion.rollback();
                }
            } catch (Exception e1) {
                System.out.println(e1.toString());
            }
        } finally {
            try {
                if (conexion != null) { //Cierro conexion
                    conexion.close();
                }
            } catch (Exception e2) {
                System.out.println(e2.toString());
            }
        }
    }

    public static void eliminarRegistroDB(String lastTitulo, String lastArtista) {
        String cadenaConexion
                = "jdbc:mysql://localhost:3306/música";
        String consulta = "DELETE FROM discos WHERE titulo=? AND artista=?"; //Doy por hecho que un artista no tiene dos canciones con el mismo nombre
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(cadenaConexion, "root", "");
            conexion.setAutoCommit(false);//Lo hago como transaccion porque soy asi de chulo y me parece mas adecuado

            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.setString(1, lastTitulo);
            ps.setString(2, lastArtista);
            int result = ps.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            System.out.println(e.toString());
            try {
                if (conexion != null) { //En caso de fallo 
                    conexion.rollback();
                }
            } catch (Exception e1) {
                System.out.println(e1.toString());
            }
        } finally {
            try {
                if (conexion != null) { //Cierro conexion
                    conexion.close();
                }
            } catch (Exception e2) {
                System.out.println(e2.toString());
            }
        }
    }

    public static DefaultTableModel filtrarRegistro(String titulo, String artista, String anio, String genero) {

        DefaultTableModel modelo = new DefaultTableModel(); //Modelo de tabla que devuelvo con los datos
        modelo.setColumnCount(4);
        String[] cabeceras = {"Título", "Artista", "Año", "Género"};
        modelo.setColumnIdentifiers(cabeceras);

        String cadenaConexion
                = "jdbc:mysql://localhost:3306/música";
        String consulta
                = "SELECT * FROM discos WHERE 1 = 1 "; //Pongo lo de los 1 porque si no me da error
        if (!titulo.isEmpty()) {
            consulta += "AND titulo LIKE '%" + titulo + "%' ";
        }
        if (!artista.equals("-")) {
            consulta += "AND artista LIKE '%" + artista + "%' ";
        }
        if (!anio.equals("-")) {
            consulta += "AND anio = " + anio + " ";
        }
        if (!genero.equals("-")) {
            consulta += "AND genero LIKE '%" + genero + "%' ";
        }
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(cadenaConexion, "root", "");

            PreparedStatement ps = conexion.prepareStatement(consulta);

            ResultSet result = ps.executeQuery();
            while (result.next()) {
                Object[] filaTemp = {result.getString("titulo"), result.getString("artista"), result.getInt("anio"), result.getString("genero")};
                modelo.addRow(filaTemp);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e2) {
                System.out.println(e2.toString());
                return null;
            }
        }
        return modelo;
    }
}
