/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo8;

/**
 *
 * @author usuario1
 */
public class Ejemplo8 {

    public static void main(String[] args) { //Creamos el método main
String palabra = "Hola"; //Declarar variable
System.out.println(invertirPalabra(palabra, palabra.length()-1)); //Imprimimos lo que tenga el método invertirPalabra
}
public static String invertirPalabra(String palabra, int longitud){//crea un método
if(longitud==0){ //valida si la palabre no tiene ninguna letra
return palabra.charAt(longitud)+""; //iprime lo que la palabra tengo
}else{
    //regresa el resultado
return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
}
}
}