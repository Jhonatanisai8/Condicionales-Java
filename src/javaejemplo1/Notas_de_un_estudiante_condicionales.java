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
public class Notas_de_un_estudiante_condicionales {
    public static void main(String[] args) {
        /*
        Pedri una nota de 0 a10 y mastrarla de la froma:
        Insufiente, suficiente, bien y notable y sobresaliente
        */
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("ingresa la nota menor o igual a 10:"));
        switch (nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: 
            case 5: JOptionPane.showMessageDialog(null,"INSUFIENTE");
            break; 
            case 6:
            case 7:JOptionPane.showMessageDialog(null,"SUFICIENTE");
                break;
            case 8:JOptionPane.showMessageDialog(null,"BIEN");
                break;
            case 9:JOptionPane.showMessageDialog(null,"NOTABLE");
                break;
            case 10: JOptionPane.showMessageDialog(null,"SOBRESALIENTE");
                break;
            default :JOptionPane.showMessageDialog(null,"Intente de nuevo, por favor");
                break;
                
                
                
        }
    }
}
