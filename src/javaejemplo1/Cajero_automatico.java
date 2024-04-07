/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejemplo1;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Cajero_automatico {
    public static void main(String[] args) {
        /*
        Hacer un programa que simule un 
        cajero automatico con un saldo inicial de 
        1000 dolares,con el siguiente menu:
        
        1-ingresar dinero
        2-retirar dinero de la cuenta
        3-salir
        */
        int opcion;//variable para la opcion 
        double sueldoinicial=1000;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Hola por favor escoge una de estas opciones"
                + "\n 1-Ingresar Dinero"
                + "\n 2-Retirar dinero"
                + "\n 3-Salir"));
        if (opcion==1) {//opcion para ingresarv saldo saldo 
            double sueldoentrante= Double.parseDouble(JOptionPane.showInputDialog("Ingresa el saldo"));
            double sueldototal = sueldoinicial + sueldoentrante;
            JOptionPane.showMessageDialog(null,"Ingreso "+sueldoentrante+" soles"
                    + "\n Sueldo total: "+sueldototal+" soles");
        } else if (opcion==2) {//opcion para retirar saldo
            
            int retiro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a retirar: "));
            if (retiro<=1000) {
            double sueldototal = sueldoinicial-retiro;
            JOptionPane.showMessageDialog(null,"Retiro "+retiro+" soles"
                    + "\n Sueldo total: "+sueldototal+" soles");
             } else {
                JOptionPane.showMessageDialog(null,"No cuenta con esta cantidad");
            }
        } else if (opcion==3) {//opcion para salir
            
        } else {//por si ingrese una opcion invalida
            JOptionPane.showMessageDialog(null,"Opcicon incorrecta,, Intente de nuevo");
        }
        
    }
}
