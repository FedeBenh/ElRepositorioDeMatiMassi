/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xml;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Álvaro
 */
public class LecturaXml {
    
    //int numeroEntero = Integer.parseInt(cadenaEntera);
    //double numeroDecimal = Double.parseDouble(cadenaDecimal);
    //LocalDate fecha = LocalDate.parse(fechaTexto);
    
    /*ATRIBUTOS
    for (int j = 0; j < hijos.getLength(); j++){
        Node hijo = hijos.item(j);
        if(hijo.getNodeType() == Node.ELEMENT_NODE){
            NamedNodeMap atributos = hijo.getAttributes();
            if(atributos.getLength() > 0){
                Node atributo = atributos.getNamedItem("AtributoHijo1");
                System.out.println("NodoHijo: " + hijo.getNodeName() + ",Atributo: " + atributo.getNodeValue());
            }else{
                System.out.println("NodoHijo: " + hijo.getNodeName() + ",Valor: " + hijo.getTextContent());
            }
        }
    }*/
    //String nombre = elemento.getAttribute("nombre");
    
    /*
    public static Club leerFicheroXML() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        Club clubObjeto = new Club(); // Objeto para almacenar la información del club

        try {
            builder = factory.newDocumentBuilder();
            Document documento = builder.parse(new File("club1.xml"));

            Element club = documento.getDocumentElement(); // Obtener el elemento raíz club

            NodeList clientesBronzeList = club.getElementsByTagName("clienteBronze");
            NodeList clientesSilverList = club.getElementsByTagName("clienteSilver");
            NodeList clientesGoldList = club.getElementsByTagName("clienteGold");

            // Leer clientes Bronze
            for (int i = 0; i < clientesBronzeList.getLength(); i++) {
                Node clienteNode = clientesBronzeList.item(i);
                if (clienteNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element clienteElement = (Element) clienteNode;
                    // Extraer información del cliente Bronze y agregarlo al objeto Club
                    int idCliente = Integer.parseInt(clienteElement.getElementsByTagName("idCliente").item(0).getTextContent());
                    String nombre = clienteElement.getElementsByTagName("nombreCliente").item(0).getTextContent();
                    String apellidos = clienteElement.getElementsByTagName("apellidosCliente").item(0).getTextContent();
                    LocalDate fechaNacimiento = LocalDate.parse(clienteElement.getElementsByTagName("fechaNacimiento").item(0).getTextContent());
                    int puntosAcumulados = Integer.parseInt(clienteElement.getElementsByTagName("puntos").item(0).getTextContent());
                    int idSocioPadrino = Integer.parseInt(clienteElement.getElementsByTagName("idPadrino").item(0).getTextContent());
                    Bronze clienteBronze = new Bronze(idCliente, nombre, apellidos, fechaNacimiento, puntosAcumulados, idSocioPadrino);
                    clubObjeto.addBronze(clienteBronze);
                }
            }

            // Leer clientes Silver
            for (int i = 0; i < clientesSilverList.getLength(); i++) {
                Node clienteNode = clientesSilverList.item(i);
                if (clienteNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element clienteElement = (Element) clienteNode;
                    // Extraer información del cliente Silver y agregarlo al objeto Club
                    int idCliente = Integer.parseInt(clienteElement.getElementsByTagName("idCliente").item(0).getTextContent());
                    String nombreCliente = clienteElement.getElementsByTagName("nombreCliente").item(0).getTextContent();
                    String apellidosCliente = clienteElement.getElementsByTagName("apellidosCliente").item(0).getTextContent();
                    LocalDate fechaNacimiento = LocalDate.parse(clienteElement.getElementsByTagName("fechaNacimiento").item(0).getTextContent());
                    int puntos = Integer.parseInt(clienteElement.getElementsByTagName("puntos").item(0).getTextContent());
                    int anyosSilver = Integer.parseInt(clienteElement.getElementsByTagName("aniosSilver").item(0).getTextContent());
                    clubObjeto.addSilver(new Silver(idCliente, nombreCliente, apellidosCliente, fechaNacimiento, puntos, anyosSilver));
                }
            }

            // Leer clientes Gold
            for (int i = 0; i < clientesGoldList.getLength(); i++) {
                Node clienteNode = clientesGoldList.item(i);
                if (clienteNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element clienteElement = (Element) clienteNode;
                    // Extraer información del cliente Gold y agregarlo al objeto Club
                    int idCliente = Integer.parseInt(clienteElement.getElementsByTagName("idCliente").item(0).getTextContent());
                    String nombreCliente = clienteElement.getElementsByTagName("nombreCliente").item(0).getTextContent();
                    String apellidosCliente = clienteElement.getElementsByTagName("apellidosCliente").item(0).getTextContent();
                    LocalDate fechaNacimiento = LocalDate.parse(clienteElement.getElementsByTagName("fechaNacimiento").item(0).getTextContent());
                    int puntos = Integer.parseInt(clienteElement.getElementsByTagName("puntos").item(0).getTextContent());

                    NodeList apadrinadosNodes = clienteElement.getElementsByTagName("apadrinados");
                    Gold clienteGold;
                    if (apadrinadosNodes.getLength() > 0) {
                        String apadrinadosString = clienteElement.getElementsByTagName("apadrinados").item(0).getTextContent();
                        String[] arrayApadrinados = apadrinadosString.split(",");//Separo los id por la ,
                        List<Integer> apadrinados = new ArrayList<>();

                        for (int j = 0; j < arrayApadrinados.length; j++) {
                            apadrinados.add(Character.getNumericValue(arrayApadrinados[j].charAt(0))); //Convertir a Integer
                        }
                        clienteGold = new Gold(idCliente, nombreCliente, apellidosCliente, fechaNacimiento, puntos, apadrinados);
                    } else {
                        clienteGold = new Gold(idCliente, nombreCliente, apellidosCliente, fechaNacimiento, puntos);
                    }

                    clubObjeto.addGold(clienteGold);
                }
            }

        } catch (ParserConfigurationException | IOException | org.xml.sax.SAXException ex) {
            System.out.println(ex.getMessage());
        }

        return clubObjeto;
    }*/

}
