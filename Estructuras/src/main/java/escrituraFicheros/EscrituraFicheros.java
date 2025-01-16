/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escrituraFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author Álvaro
 */
public class EscrituraFicheros<T> {

    public EscrituraFicheros() {//Tambien se pueden hacer los metodos static pero el generico da problemas
    }

    public boolean escribirCsv(String nombreFicheroORuta, String datos, boolean anyadirOSobrescribir) {
        //Vale para cualquier estructura de texto plano solo cambia la extension
        //Recuerda si es CSV dar los datos de entrada separados por ;
        boolean todoOk = true;
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(nombreFicheroORuta, anyadirOSobrescribir);
            pw = new PrintWriter(fw);

            pw.write(datos + "\n");

        } catch (Exception e) {
            e.printStackTrace();
            todoOk = false;
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }
                if (fw != null) {
                    fw.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
                todoOk = false;
            }
        }
        return todoOk;
    }

    public boolean escribirDat(String nombreFichero, List<T> lista) { //Recuerda implementar en el Objeto Serializable
        boolean todoOk = true;

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(nombreFichero);
            oos = new ObjectOutputStream(fos);

            for (T objetoTemp : lista) {
                oos.writeObject(objetoTemp);
            }

        } catch (Exception e) {
            e.printStackTrace();
            todoOk = false;
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
                todoOk = false;
            }
        }
        return todoOk;
    }


    public void copiaSeguridadTxt() { //Lee y escribe
        FileOutputStream fos1 = null;
        OutputStreamWriter osw1 = null;
        BufferedWriter fw1 = null;

        Scanner lectorDatos = null;

        try {
            //Escritor
            fos1 = new FileOutputStream("copia.txt");
            osw1 = new OutputStreamWriter(fos1);
            fw1 = new BufferedWriter(osw1);

            //Lector
            File archivo = new File("texto.txt"); //Archivo a leer
            lectorDatos = new Scanner(archivo);
            String datos;

            while (lectorDatos.hasNextLine()) {
                datos = lectorDatos.nextLine();
                fw1.write(datos + "\n");
            }

            System.out.println("La copia ha sido realizada con exito");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (fw1 != null) {
                    fw1.close();
                }
                if (osw1 != null) {
                    osw1.close();
                }
                if (fos1 != null) {
                    fos1.close();
                }
                if (lectorDatos != null) {
                    lectorDatos.close();
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
