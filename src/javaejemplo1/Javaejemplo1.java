/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejemplo1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Javaejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);  
      double n1,n2,n3,promedio;
      String nombre;
        System.out.print("Ingresa tu nombre :");
        nombre = Leer.nextLine();
        System.out.print("Ingresa nota de práctica :");
        n1 = Leer.nextDouble();
        System.out.print("Ingresa nota de trabajo :");
        n2 = Leer.nextDouble();
        System.out.print("Ingresa nota de examen :");
        n3 = Leer.nextDouble();
        promedio = (n1+n2+n3)/3;
        
        if (promedio>=11)
            System.out.println(nombre + " estas aprobado "); 
        else
            System.out.println(nombre+" estas desaprobado");
        
	System.out.println("Tu promedio es "+promedio);
        // TODO code application logic here
    }
    
}
