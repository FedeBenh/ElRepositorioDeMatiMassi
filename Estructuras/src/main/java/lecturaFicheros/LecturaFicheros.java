/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturaFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Álvaro
 */
public class LecturaFicheros<T> {

    public LecturaFicheros() { //Tambien se pueden hacer los metodos static pero el generico da problemas
    }

    public List<T> leerCsv(String nombreFichero) {
        //Casi siempre que leas un Csv lo mas probable es que sea para guardarlo en una lista de objetos
        File archivo = null;
        Scanner lectorDatos = null;

        List<T> listaObjeto = new ArrayList<>();
        try {
            archivo = new File(nombreFichero);
            String datos;
            lectorDatos = new Scanner(archivo);

            while (lectorDatos.hasNextLine()) { //Leo las lineas de una en una
                datos = lectorDatos.nextLine();
                System.out.println(datos);
                String[] arrayDatos = datos.split(";"); //Separo los atributos
                //T objeto = new T(arrayDatos[0], Integer.parseInt(arrayDatos[1]), arrayDatos[2], arrayDatos[3]); //Si es necesario les cambio el tipo
                //listaObjeto.add(objeto);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (archivo != null) {
                lectorDatos.close();
            }
        }
        return listaObjeto;
    }

    public List<T> leerDat(String nombreFichero) {
        //Seguramente haya que hacer casteo del return 
        //Si da problema cambiar el generico por el tipo de la lista
        boolean todoOk = true;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        List<T> listaNueva = new ArrayList<>();

        try {
            fis = new FileInputStream(nombreFichero);
            ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {       //Este metodo devuelve un 0 cuando estas al final del archivo
                T objetoTemp = (T) ois.readObject();
                listaNueva.add(objetoTemp);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return listaNueva;
    }

    /////////////////////////////////////Lecturas que no suelo utilizar/////////////////////////////////////
    public void leerBinario() {
        //Crea un programa que lea en bloques de 1000 bytes el contenido del fichero ejemplo.jpg y muestre su valor numérico por pantalla.
        File ejemplo = new File("ejemplo.jpg");
        FileInputStream lector = null;
        byte[] lectura = new byte[1000];
        int longitud;
        try {
            lector = new FileInputStream(ejemplo);

            do {
                longitud = lector.read(lectura);
                if (longitud == -1) {
                    break;
                } else {
                    for (int i = 0; i < longitud; i++) {
                        System.out.print(lectura[i] + " ");
                    }
                    System.out.println("");
                }
            } while (true);

        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (lector != null) {
                    lector.close();

                }
            } catch (Exception e) {
            }
        }
    }

    public void leerFileReaderBufferedReader() {
        //Crea un programa que lea, utilizando las clases FileReader y BufferedReader, el contenido del fichero texto.txt y muestra su contenido por pantalla.
        File archivo = new File("texto.txt");
        try {
            FileReader lector1 = new FileReader(archivo);
            BufferedReader lectorBuff1 = new BufferedReader(lector1);
            String linea;
            do {
                linea = lectorBuff1.readLine();
                if (linea == null) {
                    break;
                } else {
                    System.out.println(linea);
                }
            } while (true);
            lectorBuff1.close();
            System.out.println("");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void leerFileInputStream() {
        File datos = new File("datos.dat");
        FileInputStream lector = null;
        int valor;
        try {
            lector = new FileInputStream(datos);

            do {
                valor = lector.read();
                if (valor == -1) {
                    break;
                } else {
                    System.out.print(valor + " ");
                }
            } while (true);

        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (Exception e) {
            }
        }
    }
}
