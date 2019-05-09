/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class CicloWhile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Scanner entrada = new Scanner (System.in);
        // declaracion de variables
        
        String mensajeFinal = "";
        String nombre;
        String apellido;
        String profesion;
        String opcion;
        boolean band = true;
        int contador = 1;
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, "Informe de la ciudad de Loja");
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, "Listado de personas");
        while (band == true){
            /*
            System.out.printf("Persona %d: %s %s - %s\n" ,contador,nombre
                    ,apellido,profesion);
            */
            System.out.printf("Ingrese su nombre:  ");
            nombre = entrada.nextLine();
            System.out.printf("Ingrese su apellido: ");
            apellido = entrada.nextLine();
            System.out.printf("Ingrese su Profesion: ");
            profesion = entrada.nextLine();
            mensajeFinal = String.format("%sPersona %d %s %s - %s\n"
                    , mensajeFinal, contador,nombre, apellido, profesion);
            contador++; // el contador se incrementa
            System.out.printf("dijite 'n' Para salir: ");
            opcion = entrada.nextLine();
            if (opcion.equals("n")){
                band = false;
            }
        }
        System.out.printf("%s ", mensajeFinal);
    }
    
}
