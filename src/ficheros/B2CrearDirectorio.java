package ficheros;

import java.io.File;
import java.io.File;
import java.io.IOException;

public class B2CrearDirectorio {
 public static void main(String[] args) {
   File d = new File("C:\\Users\\Antonio\\Documents\\NetBeansProjects\\Ficheros\\Prueba"); //directorio que creo a partir del actual
      
        d.mkdir();//CREAR DIRECTORIO
       System.out.println("Directorio creado");
      
   }   
 }   