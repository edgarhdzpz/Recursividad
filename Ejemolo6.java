/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemolo6;

/**
 *
 * @author usuario1
 */
public class Ejemolo6 {

public static void main(String[] args) {
//Serie fibonacci
// 1 1 2 3 5 8 13 21 34 55
//llamada inicial
int posicion = 11;
int resultado = fibonacciRecursivo(posicion);
System.out.println(resultado);
}
public static int fibonacciRecursivo(int n) {
//CASO BASE, si es cero devuelve un cero
//Puedes poner n<=0 tamvien para incluir negativos
if (n == 0) {
return 0;
//CASO BASE, si es 1 devuelve un 1
} else if (n == 1) {
return 1;
} else {
//Hago la suma
return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
}
}
}
