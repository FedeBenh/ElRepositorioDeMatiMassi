/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xml;

import java.util.List;
import java.io.File;
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
public class EscrituraXml {
    /*Escribir atributo
    Element elemento1 = documento.createElement("elementoHijo1");
    elemento1.setAttribute("AtributoHijo1", "ValorAtributoHijo1");
     */
//String.valueOf(numeroEnteroODecimal);
    
 /*
 public static void guardarClubs(Club club) {
        DocumentBuilderFactory factory
                = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document documento = implementation.createDocument(null, "club", null);
            documento.setXmlVersion("1.0");

            int maxBronze = club.getClientesBronze().size();
            int maxSilver = club.getClientesSilver().size();
            int maxGold = club.getClientesGold().size();

            Element clientesBronze = documento.createElement("clientesBronze");
            Element clientesSilver = documento.createElement("clientesSilver");
            Element clientesGold = documento.createElement("clientesGold");

            //Clientes Bronze
            for (int i = 0; i < maxBronze; i++) {
                Element clienteBronze = documento.createElement("clienteBronze");

                Element idCliente = documento.createElement("idCliente");
                Text textoidCliente = documento.createTextNode(String.valueOf(club.getClientesBronze().get(i).getIdCliente()));
                idCliente.appendChild(textoidCliente);
                clienteBronze.appendChild(idCliente);

                Element nombreCliente = documento.createElement("nombreCliente");
                Text textoNombreCliente = documento.createTextNode(club.getClientesBronze().get(i).getNombre());
                nombreCliente.appendChild(textoNombreCliente);
                clienteBronze.appendChild(nombreCliente);

                Element apellidosCliente = documento.createElement("apellidosCliente");
                Text textoApellidosCliente = documento.createTextNode(club.getClientesBronze().get(i).getApellidos());
                apellidosCliente.appendChild(textoApellidosCliente);
                clienteBronze.appendChild(apellidosCliente);

                Element fechaNacimiento = documento.createElement("fechaNacimiento");
                Text textoFechaNacimiento = documento.createTextNode(club.getClientesBronze().get(i).getFechaNacimiento().toString());
                fechaNacimiento.appendChild(textoFechaNacimiento);
                clienteBronze.appendChild(fechaNacimiento);

                Element puntos = documento.createElement("puntos");
                Text textoPuntos = documento.createTextNode(String.valueOf(club.getClientesBronze().get(i).getPuntos()));
                puntos.appendChild(textoPuntos);
                clienteBronze.appendChild(puntos);

                Element idPadrino = documento.createElement("idPadrino");
                Text textoIdPadrino = documento.createTextNode(String.valueOf(club.getClientesBronze().get(i).getIdPadrino()));
                idPadrino.appendChild(textoIdPadrino);
                clienteBronze.appendChild(idPadrino);

                clientesBronze.appendChild(clienteBronze);
            }
            documento.getDocumentElement().appendChild(clientesBronze);

            //Clientes Silver
            for (int i = 0; i < maxSilver; i++) {
                Element clienteSilver = documento.createElement("clienteSilver");

                Element idCliente = documento.createElement("idCliente");
                Text textoidCliente = documento.createTextNode(String.valueOf(club.getClientesSilver().get(i).getIdCliente()));
                idCliente.appendChild(textoidCliente);
                clienteSilver.appendChild(idCliente);

                Element nombreCliente = documento.createElement("nombreCliente");
                Text textoNombreCliente = documento.createTextNode(club.getClientesSilver().get(i).getNombre());
                nombreCliente.appendChild(textoNombreCliente);
                clienteSilver.appendChild(nombreCliente);

                Element apellidosCliente = documento.createElement("apellidosCliente");
                Text textoApellidosCliente = documento.createTextNode(club.getClientesSilver().get(i).getApellidos());
                apellidosCliente.appendChild(textoApellidosCliente);
                clienteSilver.appendChild(apellidosCliente);

                Element fechaNacimiento = documento.createElement("fechaNacimiento");
                Text textoFechaNacimiento = documento.createTextNode(club.getClientesSilver().get(i).getFechaNacimiento().toString());
                fechaNacimiento.appendChild(textoFechaNacimiento);
                clienteSilver.appendChild(fechaNacimiento);

                Element puntos = documento.createElement("puntos");
                Text textoPuntos = documento.createTextNode(String.valueOf(club.getClientesSilver().get(i).getPuntos()));
                puntos.appendChild(textoPuntos);
                clienteSilver.appendChild(puntos);

                Element aniosSilver = documento.createElement("aniosSilver");
                Text textoAniosSilver = documento.createTextNode(String.valueOf(club.getClientesSilver().get(i).getAnyosSilver()));
                aniosSilver.appendChild(textoAniosSilver);
                clienteSilver.appendChild(aniosSilver);

                clientesSilver.appendChild(clienteSilver);
            }
            documento.getDocumentElement().appendChild(clientesSilver);

            //Clientes Gold
            for (int i = 0; i < maxGold; i++) {
                Element clienteGold = documento.createElement("clienteGold");

                Element idCliente = documento.createElement("idCliente");
                Text textoidCliente = documento.createTextNode(String.valueOf(club.getClientesGold().get(i).getIdCliente()));
                idCliente.appendChild(textoidCliente);
                clienteGold.appendChild(idCliente);

                Element nombreCliente = documento.createElement("nombreCliente");
                Text textoNombreCliente = documento.createTextNode(club.getClientesGold().get(i).getNombre());
                nombreCliente.appendChild(textoNombreCliente);
                clienteGold.appendChild(nombreCliente);

                Element apellidosCliente = documento.createElement("apellidosCliente");
                Text textoApellidosCliente = documento.createTextNode(club.getClientesGold().get(i).getApellidos());
                apellidosCliente.appendChild(textoApellidosCliente);
                clienteGold.appendChild(apellidosCliente);

                Element fechaNacimiento = documento.createElement("fechaNacimiento");
                Text textoFechaNacimiento = documento.createTextNode(club.getClientesGold().get(i).getFechaNacimiento().toString());
                fechaNacimiento.appendChild(textoFechaNacimiento);
                clienteGold.appendChild(fechaNacimiento);

                Element puntos = documento.createElement("puntos");
                Text textoPuntos = documento.createTextNode(String.valueOf(club.getClientesGold().get(i).getPuntos()));
                puntos.appendChild(textoPuntos);
                clienteGold.appendChild(puntos);

                Element apadrinados = documento.createElement("apadrinados");
                int maxApadrinados = club.getClientesGold().get(i).getApadrinados().size();
                for (int j = 0; j < maxApadrinados; j++) {
                    Text textoApadrinados = documento.createTextNode(String.valueOf(club.getClientesGold().get(i).getApadrinados().get(j)));
                    apadrinados.appendChild(textoApadrinados);
                    if (j == (maxApadrinados - 1)) { //Compruebo si es el ultimo para no poner coma
                        break;
                    }
                    Text textoComa = documento.createTextNode(",");
                    apadrinados.appendChild(textoComa);
                }
                clientesGold.appendChild(apadrinados);

                clientesGold.appendChild(clienteGold);
            }
            documento.getDocumentElement().appendChild(clientesGold);

            Result result = new StreamResult(new File("club.xml"));
            Source source = new DOMSource(documento);
            Transformer transformer
                    = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());

        }
    }*/
}
