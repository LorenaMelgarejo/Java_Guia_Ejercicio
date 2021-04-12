
package ejercicio_3;

/**
 * @author lorena_melgarejo
 */

public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
       // String nombre[8];
       //palabra reservada String ,siempre la primera letra en mayúscula
       
       String nombre[] = new String[8]; //se declara e inicializa el vector
        
       
        nombre[0]= "Alejandra";
        nombre[1]= "Leonardo";
        nombre[2]= "Rosa" ;
        nombre[3]= "Guillermo";
        nombre[4]= "Gabriel" ;
        nombre[5]= "Mariel";
        nombre[6]= "Luisa";
        nombre[7]= "Ludmila";
      
        //Recorro el vector para mostrar los nombres , utilizo la palabra length para obtener el tamaño del vector       
        for(int i = 0; i < nombre.length; i++) { 
            
           System.out.println("Nombre: "+ nombre[i]);
        }
        
        
    }
    
}
