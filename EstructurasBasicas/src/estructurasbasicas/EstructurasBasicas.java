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
public class EstructurasBasicas {

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
        int contador = 1;
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, "Informe de la ciudad de Loja");
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, "Listado de personas");
        while (contador < 5){
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
        }
        System.out.printf("%s ", mensajeFinal);
    }
    
}
