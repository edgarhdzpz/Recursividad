/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo10;

/**
 *
 * @author usuario1
 */
public class Ejemplo10 {

    public static void main(String[] args) { //Creamos el método main
    int numero = 347; //Declaramos variable
    System.out.println(sumaDigitos(numero)); //Imprimimos
    }
    public static int sumaDigitos(int numero){ //Creamos el método simaDigitos
    if(numero < 10){ //caso base
    return numero; //devuelvo el numero
    }else{
        //realizar la suma
    return (numero % 10) + sumaDigitos(numero/10); //Cojo el digito y llamo a la funcion
    }
    }
}
