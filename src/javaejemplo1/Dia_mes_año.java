/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejemplo1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Dia_mes_año {

    public static void main(String[] args) {
        /*
         Pedir el dia, mes y año de una fecha e indicar si 
         la fecha es correcta. Suponiendo que todos los meses
         son de 30 dias.
         */
        int dia, mes, año;
        dia = Integer.parseInt(JOptionPane.showInputDialog("ingresa el dia:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("ingresa el mes:"));
        año = Integer.parseInt(JOptionPane.showInputDialog("ingresa el año:"));

        if (dia >= 1 && dia <= 30) {
            if (mes >= 1 && mes <= 12) {
                if (año != 0) {
                    JOptionPane.showMessageDialog(null, "La fecha es correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La fecha es incorreta, mes incorreto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La fecha es incorreta, dia incorreto");
        }

        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa tu edad");
        int edad = leer.nextInt();
        if (edad >= 18) {
            System.out.println("es mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

    }
}
