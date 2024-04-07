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
public class Dia_mes_año_2 {
    
    public static void main(String[] args) {
        /*
        Pedir el dia , mes y año de una fecha e indicar si la 
        fecha es correcta. Con meses de 28, 30 y 31. 
        Sin años bisiestos
        */
        /*int dia, mes, año;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingres el dia");
        dia = leer.nextInt();
        System.out.println("ingresa el mes: ");
        mes = leer.nextInt();
        System.out.println("Ingresa el año");*/
        /*
        Construir un programa que simule el funcionamiento de una calculadora
        que pueda realizar las cuatro operacionesaritmeticas basicas:
        suma, resta, multiplicacion, division con valores numericos enteros. El 
        usuario debe especificar la operacion co el primer caracter del primer 
        parametro  de la linea de comandos:
        S o s para la suma
        R o r para la resta
        M o m para la multiplicacion
        D o d para la division
        */
        float n1,n2,suma,resta,multiplicacion,division;
        char operacion;
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el primer valor: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el segundo valor: "));
        
        operacion = JOptionPane.showInputDialog("Ingresa la operacion que desea realizar:").charAt(0);
        
        switch (operacion){
            case 'S' : 
            case 's' : suma = n1+n2;
                JOptionPane.showMessageDialog(null,"la suma es: "+suma);
                break;
            case 'R': 
            case 'r': resta = n1-n2; 
                JOptionPane.showMessageDialog(null,"la resta es: "+resta);
                break;
            case 'M':
            case 'm' : multiplicacion = n1*n2;
                JOptionPane.showMessageDialog(null,"la multiplicacion es: "+multiplicacion);
            case 'D':
            case 'd': division = n1/n2;
                JOptionPane.showMessageDialog(null,"la division es: "+division);
            default : JOptionPane.showMessageDialog(null,"Opcion no valida! por favor intente de nuevo");
                break;       
        }
        
    }
    
}
