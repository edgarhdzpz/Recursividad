/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo3;

/**
 *
 * @author usuario1
 */
public class Ejemplo3 {
    public static void main(String[] args){ //Creamos el método main
        int[] array = {1,2,3,4,5,6,7}; //Creamos un array
        mostrarArrayRecursivo(array, 0); //Pasamos el array y la posicion donde empieza
    }
    
    public static void mostrarArrayRecursivo(int[] array, int indice){ //Creamos el método mostrarArrayRecursivo
    /*1° forma*/
    
    if (indice == (array.length-1)){ //Si el indice es igual al array con la longitud -1
    System.out.println(array[indice]); //imprimir el array con el indice
    }else{ //si no
    System.out.println(array[indice]); //Imprimir el array con el indíce
    mostrarArrayRecursivo(array, indice+1); //Mandamos a traer el método mostrarArrayRecursivo
    }
    
    //2° forma
    /*if(indice !=array.length){ //Mostrar el valor en ese indice
        System.out.println(array[indice]); //Llamamos recursivamente a la función 
        mostrarArrayRecursivo(array, indice+1);
    }*/
   }
   }
