/*
   desarrollar una aplicacion que permita ingresar placas de carros se asume que as placas ingresadas pertenecen a la region costa 
del Ecuador en base a la placa nuestro programa determinara y presentara la placa con la provincia a la que pertenece
provincias :  Esmeraldas(E), Santo Domingo de los Tsáchilas(J), Manabí(M), Los Ríos(R), Guayas(G), Santa Elena(Y) y El Oro (O)
 */
package manejosswitch;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        String placa;
        System.out.printf("Ingrese las placas de su vehiculo: ");
        placa = entrada.nextLine();
        char valor = placa.charAt(0);
                
        switch(valor){
            case 'e':
            case'E':
                System.out.printf("La provincia de origen de su vehiculo es: Esmeraldas \nPor sus placas de:%s\n", 
                        placa.toUpperCase());
                break;
            
            case 'j':
            case'J':
                System.out.printf("La provincia de origen de su vehiculo es:  Santo domingo de los tsáchilas \n"
                        + "Por sus placas de:%s\n", 
                       placa.toUpperCase());
                break;  
            
            case 'm':
            case'M':
                System.out.printf("La provincia de origen de su vehiculo es: Manabí\nPor sus placas de:%s\n", 
                       placa.toUpperCase());
                break;
               
            case 'r':
            case'R':
                System.out.printf("La provincia de origen de su vehiculo es: Los Rios\nPor sus placas de:%s\n", 
                        placa.toUpperCase());
                break;
                
            case 'g':
            case'G':
                System.out.printf("La provincia de origen de su vehiculo es:  Guayas\nPor sus placas de:%s\n", 
                         placa.toUpperCase());
                break;
              
            case 'y':
            case'Y':
                System.out.printf("La provincia de origen de su vehiculo es: Santa Elena\nPor sus placas de:%s\n", 
                        placa.toUpperCase());
                break;
                
            case 'o':
            case'O':
                System.out.printf("La provincia de origen de su vehiculo es: El Oro\nPor sus placas de:%s\n", 
                        placa.toUpperCase());
                break;
            default:
                System.out.println("ninguna de las anteriores");
                
        }
        
    }
}
