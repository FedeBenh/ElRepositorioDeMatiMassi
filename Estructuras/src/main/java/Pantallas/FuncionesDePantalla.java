/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Álvaro
 */
public class FuncionesDePantalla {
    //TEXTFIELD
    //tfBusTitulo.setText("");  //Escribir un textField
    
    //RADIOBUTTON
    //rbSerializado.isSelected();   //Ver si esta seleccionado
    
    //COMBOBOX
    //cbBusArtista.setSelectedItem("-"); //Seleccionar algo en un comboBox
    
    //TABLAS
    //DefaultTableModel modelo = new DefaultTableModel(); //crear modelo
    //tblTabla.setModel(dbMusica.leerDB());               //setear modelo
    //tblTabla.setDefaultEditor(Object.class, null); //Que nuestra tabla se pueda seleccionar pero no editar
    
    //Coger fila seleccionada de una tabla
//    int filaSeleccionada = tblTabla.getSelectedRow();
//     if (tblTabla.getSelectedRow() != -1) {
//            tfEditTitulo.setText((String) tblTabla.getValueAt(filaSeleccionada, 0));
//     }
    
    //EVENTO KEYPRESSED
//    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            AreaTexto.setText(AreaTexto.getText() + CuadroTexto.getText() + "\n");
//            CuadroTexto.setText("");
//        }
    
    //BOTÓN
    //bEliminar.setEnabled(true);  //Habilitar y desabilitar boton
    
    
    
    
    
    //Funciones
//    private boolean comprobarCampos() {
//        Pattern patternCampos = Pattern.compile("[a-zA-Z0-9]{1,}");
//
//        Matcher matcherTitulo = patternCampos.matcher(tfEditTitulo.getText());
//        Matcher matcherArtista = patternCampos.matcher(tfEditArtista.getText());
//        Matcher matcherGenero = patternCampos.matcher(tfEditGenero.getText());
//
//        boolean todoOk = true;
//        if (!matcherTitulo.matches() && !matcherArtista.matches() && !matcherGenero.matches()) {
//            lError.setForeground(Color.red);
//            lError.setText("Debe rellenar todos los campos");
//            todoOk = false;
//        } else {
//            lError.setText("");
//        }
//        return todoOk;
//    }
}
