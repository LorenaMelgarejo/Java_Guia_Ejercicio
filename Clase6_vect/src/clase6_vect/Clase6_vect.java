package clase6_vect;
import java.util.Scanner;

public class Clase6_vect {

    
    public static void main(String[] args) {
        
        int numeros [] = new int[8]; //asignación y declaración de mi vector
        
        /**numeros[0] = 35;
        numeros[1] = 40;
        numeros[2] = 23;
        numeros[3] = 11;
        numeros[4] = 91;
        numeros[5] = 26;
        numeros[6] = 15;
        numeros[7] = 21;
        **/
        
        Scanner teclado = new Scanner(System.in);
        
        for (int i=0; i<numeros.length;i++){
            
            //System.out.println("Estoy en el indice: "+i+" el número que esta guardaro en el : " + numeros[i]);
            System.out.println("ingrese el valor que quiere guardar en la posición: "+ i);
            numeros[i] = teclado.nextInt();
            
        }
        
         //recorrido para mostrar lo que esta guardado
        
         for (int i=0; i<numeros.length;i++){
             //System.out.
         }
        
        
    }
       
    
}
