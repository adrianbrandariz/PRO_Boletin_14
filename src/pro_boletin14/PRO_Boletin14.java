/*
 * BOLETIN 14
 * 1. Codifica un programa para gestionar un garaje de coches.
 * La clase Garaje tiene como atributos:
 *      - numeroCoches (para saber el nº de coches que están en ese momento en el garaje).  
 *      - matricula para identificalo           
 * Antes de dejar aparcar un coche, debemos comprobar que tenemos sitio para él,
 * en caso afirmativo ponemos un mensaje “ PLAZAS DISPONIBLES “ y registramos el coche.
 * En el caso contrario pondríamos un mensaje “ COMPLETO “.
 *
 * Para hacer más fácil el programa, suponer que el garaje tiene capacidad para 5 coches.
 * Para calcular el precio do aparcamiento, considerad el siguiente ejemplo:
 * Primeras 3 horas. ----> 1.5 €
 * El resto del tiempo: pagamos 0.20 € cada hora.
 * La salida será:
 * FACTURA
 * MATRICULA COCHE ........
 * TIEMPO .................
 * PRECIO...............
 * DINERO RECIBIDO...........
 * DINERO DEVUELTO............
 *
 * GRACIAS POR USAR NUESTRO APARCAMIENTO 
 */
package pro_boletin14;

import javax.swing.JOptionPane;
/**
 *
 * @author abrandarizdominguez
 */
public class PRO_Boletin14 {
    
    public static void main(String[] args) {
        /* 
         * Se crea un objeto de tipo Garaje y se asignan sus valores.
         * Especificando, en este caso, que el garaje estará compuesta por 10 plazas y
         * estarán en uso 0.
         */ 
        Garaje gar1 = new Garaje(10, 0);
        gar1.aparcarCoche();

                
    }
    
}
