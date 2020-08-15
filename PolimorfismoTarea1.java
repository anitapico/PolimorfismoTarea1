/*
 * Diseñe e implemente un algoritmo que le permita imprimir el tipo y la cantidad 
de gas, cuando tiene una carga de motor del 56,9 y mezcla de biodiesel de higuerilla 
de 5,0. Mediante polimorfismo.
 */
package polimorfismotarea1;

/**
 * @author Anita Pico Solis
 */
class EscapeGas{
public void TipoCantidadEscapeGas(){
  System.out.println(" El escape de ga es: - La cantidad de escape es: ");
}
}

class DioxidoCarbono extends EscapeGas{
public void TipoCantidadEscapeGas(){
System.out.println(" El tipo de gas es: Dióxido de Carbono - La cantidad de escape es : 4,4% \n ");
}
}

class MonoxidoCarbono extends EscapeGas{
public void TipoCantidadEscapeGas(){
System.out.println(" El tipo de gas es: Monóxido de Carbono - La cantidad de escape es: 416,7 ppm \n");
}
}

class MonoxidoNitrogeno extends EscapeGas{
public void TipoCantidadEscapeGas(){
System.out.println(" El tipo de gas es: Monóxido de Nitógeno - La cantidad de escape es: 375,9 ppm \n");
}
}
 
class Hidrocarburos extends EscapeGas{
public void TipoCantidadEscapeGas(){
System.out.println(" El tipo de gas es: Hidrocarburos - La cantidad de escape es: 16,5 ppm \n");
}
}
public class PolimorfismoTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EscapeGas gas1=new DioxidoCarbono();
        EscapeGas gas2=new MonoxidoCarbono();
        EscapeGas gas3=new MonoxidoNitrogeno();
        EscapeGas gas4=new Hidrocarburos();
        
        System.out.println("    UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("             INGENIERIA AUTOMOTRIZ");
        System.out.println("Nombre: Pico Solis Ana Graciela");
        System.out.println("Materia: Programación ");
        System.out.println("NRC: 7450");    
        System.out.println("***********************************************************"); 
        System.out.println("      Polimorfismo - Cantidad de Emisión de Gases ");   
        System.out.println("************************************************************");
        
        
        System.out.println(" El tipo de gas y la cantidad que escapa a una carga de motor del 56,9% "
                + "y mezcla del biodiesel de higuerilla del 5,0 es: ");
        gas1.TipoCantidadEscapeGas();
        System.out.println(" El tipo de gas y la cantidad que escapa a una carga de motor del 56,9% "
                + "y mezcla del biodiesel de higuerilla del 5,0 es: ");
        gas2.TipoCantidadEscapeGas();
        System.out.println(" El tipo de gas y la cantidad que escapa a una carga de motor del 56,9% "
                + "y mezcla del biodiesel de higuerilla del 5,0 es: ");
        gas3.TipoCantidadEscapeGas();
        System.out.println(" El tipo de gas y la cantidad que escapa a una carga de motor del 56,9% "
                + "y mezcla del biodiesel de higuerilla del 5,0 es: ");
        gas4.TipoCantidadEscapeGas();
        
        
    }
    
}
