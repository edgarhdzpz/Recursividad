/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo7;

/**
 *
 * @author usuario1
 */
public class Ejemplo7 {

    
public static void main(String[] args) { //Declaraos el método main
    //Declaramos la variable a
int a = 254; //400 + 50 + 2 
System.out.println(invertirNum(a, 2)); //Imprimir lo que tenga el método invertirNum
}
public static int invertirNum(int num, int pos){ //Creamos el método invertirNum
//Si es menor que 10 devuelvo el numero (el ultimo numero)
if(num < 10){
return num;
}else{
//modulo del numero y se multiplica por la potencia (4 * 100) por ejemplo
return (num % 10) * (int) Math.pow(10, pos) + (invertirNum(num/10, pos-1));
}
}
}
