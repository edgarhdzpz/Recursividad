/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo9;

/**
 *
 * @author usuario1
 */
public class Ejemplo9 {

    
public static void main(String[] args) { //Crear el método main
    //Declarar variables
int base = 10; 
int exponente = 2;
System.out.println(potencia(base, exponente)); //imprimir
}
public static double potencia(int base, int exponente) { //Creamos el método potencia
if (exponente == 0) { //caso base
return 1; //10^0 = 1
} else if (exponente == 1) { //caso base
return base; //10^1 = 10
} else if (exponente < 0) { //Exponente negativo
return potencia(base, exponente + 1) / base;
} else { //Exponente positivo
return base * potencia(base, exponente - 1);
}
}
}
