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
public class usodelmientras {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        //Ciclo while
        //Mostrar un mensaje o pedir una cierta cantidad de veces
        int contpersonas=0;
        int i=1;
        while (i<=3){
            System.out.println("Nombre "+i);
            System.out.println("Ingresa su nombre por favor : ");
            String nombre= sc.nextLine();
            if (nombre.equals("jhonatan")){
                contpersonas++;
            }
            
            i=i+1;
            //i++;
        }
        System.out.println("La cantidad de personas con nombre = jhonatan es "+contpersonas);
         
    } 
    
}
