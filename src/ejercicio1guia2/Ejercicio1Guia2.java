/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
 *  El programa deberá después mostrar el resultado de la suma

 */
package ejercicio1guia2;

import java.util.Scanner;

public class Ejercicio1Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner num = new Scanner(System.in);
     int n1;
     int n2;
     int resultado;
     
        System.out.println("Ingrese un numero");
        
        n1 = num.nextInt();
        
        System.out.println("Ingrese otro numero");
        
        n2 = num.nextInt();
        
        resultado = n1 + n2;
        
        System.out.println("El resutado de la suma es: " +resultado);
                
            
     
    }
    
}
