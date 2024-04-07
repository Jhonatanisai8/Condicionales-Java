package javaejemplo1;
import javax.swing.JOptionPane;
public class kilos_a_otra_unidad_de_maza {
    public static void main(String[] args) {
        /*
        Hacer un programa que pase de kg a otra unidad de medida
        de masa, mostrar en pantalla un menu con las opciones posible:
        1-toneladas
        2-Gramos
        3-Miligramos
        4-microgramo
        5-salir
        */
        int opcion;
        float kilos;
        kilos = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad de kilogramos: "));
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion: "
                + "\n 1-Toneladas"
                + "\n 2-Gramos"
                + "\n 3-Miligramos"
                + "\n 4-Microgramo"
                + "\n 5-Salir"));
        if (opcion==1) {
            float toneladas = kilos / 1000;
            JOptionPane.showMessageDialog(null,"Cantidad en toneladas: "+toneladas);
        }
        else if (opcion==2) {
            float gramos= kilos*1000;
            JOptionPane.showMessageDialog(null,"Cantidad en Gramos: "+gramos);
        }
        else if (opcion==3) {
            float miligramos= kilos*1000000;
            JOptionPane.showMessageDialog(null,"Cantidad en Miligramos: "+miligramos);
        }
        else if (opcion==4) {
            float gramos= kilos*100000000;
            JOptionPane.showMessageDialog(null,"Cantidad en Microgramos: "+gramos);
        }
        else if (opcion==5) {
            
        }
        else {
            JOptionPane.showMessageDialog(null,"Opcion no valida, intente de nuevo");
        }
    }
}
