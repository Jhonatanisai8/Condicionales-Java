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
public class Cuantas_cifras_tiene_un_numero {
    public static void main(String[] args) {
        /*
        Pedir un numero entre 0 y 99 999 y decir 
        cuantas cifras tiene
        */
        int numero;
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        numero = leer.nextInt();
         if (numero < 10) {
            System.out.println("tine una cifras");
        } else if (numero < 100) {
            System.out.println("tiene dos cifras");
        } else if (numero < 1000) {
            System.out.println("tiene tres cifras");
        } else  if (numero < 10000){
            System.out.println("tiene cuatrp cifras");
        } else {
             System.out.println("tiene cinco cifras");
        }
    }
}
