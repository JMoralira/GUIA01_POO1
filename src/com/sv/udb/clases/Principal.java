package com.sv.udb.clases;

import java.io.*;
import java.util.*;


/**
 *
 * @author Estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  /* Profesor yo inicialmente hice un proyecto por ejercicio,
        no recordaba que en github es un repositorio por proyecto,
        entonces puse el codigo de los ejercicios comentados, 
        para que pueda verlos, quitandole los comentarios*/
        
        
        
        
        
        
        
        //EJERCICIO 1
    /*     try{
            Scanner datos = new Scanner (System.in);
            String nomb, nomb2,apel, apel2;
        //variables que almacenaran la valores
        
            System.out.println("Introduzca su primer nombre: " ) ;
            nomb = datos.next();
            
            System.out.println("Introduzca su segundo nombre: " ) ;
            nomb2 = datos.next();
            
            System.out.println("Introduzca su primer apellido: " ) ;
            apel = datos.next();
            
            System.out.println("Introduzca su segundo apellido: " ) ;
            apel2 = datos.next();
            
            
            System.out.println("Las iniciales de su nombre son: "+(nomb.charAt(0))+","+(nomb2.charAt(0))+","+(apel.charAt(0))+","+(apel2.charAt(0)));
            
          //  System.out.println("Su nombre completo es : " +(nomb)+" "+(nomb2)+" "+(apel)+" "+(apel2));
        }
        catch (Exception e)         
     {
         System.out.println("HAY UN ERROR, SE RECOMIENDA REPETIR PROCESO");
     }*/
        
        
        
        
        
        
        
        
        
        
        
        
        // EJERCICIO 2
     /* File mostrartxt = null;  
      FileReader leerFile = null;
      BufferedReader leerBuffe = null;
      
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         mostrartxt = new File ("C:\\\\Users\\\\Jose Morales\\\\Desktop\\\\Nueva carpeta\\\\datos.txt");
         leerFile = new FileReader (mostrartxt);
         leerBuffe = new BufferedReader(leerFile);

         // Lectura del archivo de texto plano
         String linea;
         while((linea=leerBuffe.readLine())!=null)
         {
             System.out.println(linea.charAt(0));         
         }         
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != leerFile ){   
               leerFile.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }    */
        
        
        
        
        
        
        
        
        
        // EJERCICIO 3
       /* try
        {
          Scanner datos = new Scanner (System.in);
            int nume,conta=0;
           List<Integer> listaNume= new ArrayList();
           
          while( conta != 3)
           {
                System.out.println("Ingrese un numero entero: ");
                nume = datos.nextInt();
                listaNume.add(nume);
               
             for( Integer numeVece: listaNume)
             {
                 if(nume == numeVece)
                 {
                     conta++;
                 }
                 if(conta < 3 )
                 {
                 conta=0;
                 }
                 else
                 {
                     System.out.println("Numero que se repitio 3 veces: "+nume);
                 }
             }
           }
          
        }
            
        catch(Exception e)
        {
            System.out.println("HAY UN ERROR, SE RECOMIENDA REPETIR PROCESO");
        }*/
        
        
        
        
        
        
        
        
        
        //EJERCICIO 4
       /* try
        {
        Random r = new Random ();
        Scanner datos = new Scanner(System.in);
        int seguir = 1;
        while(seguir ==1)
        {
        int numerodado= r.nextInt(6-1)+1;       
        System.out.println("El dado cayo en el numero: "+numerodado);
            System.out.println("Quiere lanzar el dado denuevo, ingrese el numero 1: ");
            seguir = datos.nextInt();
        }
    }
         catch(Exception e)
        {
            System.out.println("HAY UN ERROR, SE RECOMIENDA REPETIR PROCESO");
        }*/
    }
    
}
