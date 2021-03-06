package pro_boletin14;

import javax.swing.JOptionPane;

/**
 *
 * @author abrandarizdominguez
 */
public class Garaje{
    private int numeroCoches;
    private String matricula;
    private int plazas;
    private double precio;
    private double dineroRecibido;
    // Constructor por defecto:
    public Garaje(){
        
    }
    // Constructor por parametros
    public Garaje(int plazas, int numeroCoches){
        this.numeroCoches = numeroCoches;
        this.plazas = plazas;
    }
    //SETS Y GETS
    public void setNumeroCoches(int numeroCoches){
        this.numeroCoches = numeroCoches;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public int getNumeroCoches(){
        return numeroCoches;
    }

    public String getMatricula(){
        return matricula;
    }

    public int getPlazas(){
        return plazas;
    }
    // Método "aparcarCoche" que muestra si hay plazas disponibles en un garaje:
    public void aparcarCoche(){
        // Estructura condicional que validará si hay plazas disponibles en el garaje.
        if (plazas>numeroCoches){
            JOptionPane.showMessageDialog(null,"HAY PLAZAS DISPONIBLES.");
            matricula = JOptionPane.showInputDialog("Bienvenido.\n Por favor, introduzca el número de la mátricula del vehículo.");
            // Se pide el tiempo que estará el vehículo en el garaje y calculará el precio que costará
            int tiempo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tiempo que se ha quedado el vehículo en el garaje:"));
                if (tiempo<=3){
                    precio = 1.5;
                }
                else{
                    precio = 1.5 + tiempo*0.20;
                }
            // Se pide el dinero y se añade una condición para que la cantidad sea la correcta.
            do{
                dineroRecibido = Double.parseDouble(JOptionPane.showInputDialog("La cantidad a pagar es "+precio+"\n Introduce la cantidad a pagar:"));
            } while (dineroRecibido<precio);
            JOptionPane.showInputDialog("CANTIDAD ACEPTADA\n"
                    + " * FACTURA *\n" +
                    " * MATRICULA COCHE "+matricula+"\n" +
                    " * TIEMPO "+tiempo+"\n" +
                    " * PRECIO "+precio+"\n" +
                    " * DINERO RECIBIDO "+dineroRecibido+"\n" +
                    " * DINERO DEVUELTO "+(dineroRecibido-precio)+"\n" +
                    " *\n" +
                    " * GRACIAS POR USAR NUESTRO APARCAMIENTO ");
        }
        else{
            JOptionPane.showMessageDialog(null,"GARAJE COMPLETO.");
        }
    }
}
