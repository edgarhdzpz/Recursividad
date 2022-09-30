/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo2;

/**
 *
 * @author usuario1
 */
public class Ejemplo2{
        public static void main(String[] arg){
        int n=5; //Guarda el reultado en una variable
        int resultado=factorialRecursivo(n); //Se le asigna el valor del metodo a la variable
        System.out.println(resultado); //Muestra el resultado
    }
    
    public static int factorialRecursivo(int numero){
        int res; //Define variable
        if(numero==1){ //Valida si el numero es 1
            return 1; //Se termina la recursión
        }
        else{
             //Se llama asi misma la funcion, con el valor del numero menos 1
            res = numero * factorialRecursivo(numero-1);
        }
        //Devolvemos el valor
        return res;
    }
}
