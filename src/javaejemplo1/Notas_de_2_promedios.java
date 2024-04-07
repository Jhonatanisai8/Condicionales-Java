package javaejemplo1;

import java.util.Scanner;

public class Notas_de_2_promedios {
    public static void main(String[] args) {
        /*
        Hacer un program que calcule el promedio final de N estudiantes  de tres unidades 
        siendo lo siguiente
        1-primera unidad:
        Practica calificadas
        informe academico
        examen parcial 
        2-Segunda Unidad:
        Examen parcial
        Informe academico
        practicas calificadas
        3-tercera unidad:
        Examen parcial
        Informe academico
        practicas calificadas
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Programa para sacar promedios de notas"
                + "\n Ingrese la cantidad de estuciantes:");
        int n = leer.nextInt();
        for (int i = 1; i <=n; i++) {
            
            System.out.println("Estudiante"+ i );
            //pedimos la notas
            System.out.println("Primera unidad");
            System.out.println("Ingresa la nota de practicas calificadas: ");
            double practicascalificadas = leer.nextDouble();
            System.out.println("ingrese la nota del informe de investigacion: ");
            double informe = leer.nextDouble();
            System.out.println("Ingresa la nota del primer examen parcial: ");
            double parcial1 = leer.nextDouble();
            double promedio1= (practicascalificadas + informe + parcial1)/3;
            System.out.println("Segunda Unidad");
            System.out.println("Ingresa las calificaciones: ");
            System.out.println("Ingresa la nota del segundo examen parcial: ");
            double parcial2 = leer.nextDouble();
            System.out.println("Ingresa la nota del informe academico: ");
            double informe2 = leer.nextDouble();
            System.out.println("ingresa la nota de practicas calificadas: ");
            double practicascalificadas2 = leer.nextDouble();
            double promedio2= (practicascalificadas2 + informe2 + parcial2)/3;
            System.out.println("Unidad Tercera");
            System.out.println("Ingresa notas");
            System.out.println("Nota tercer examen parcial: ");
            double examen3 = leer.nextDouble();
            System.out.println("Nota informe academico: ");
            double informe3 = leer.nextDouble();
            System.out.println("Nota practicas: ");
            double practicas3 = leer.nextDouble();
            double promedio3 = (examen3 + informe3 + practicas3)/3;
            double promediofinal=(promedio1 + promedio2 + promedio3)/3;
            System.out.println("Su promedio final es: "+promediofinal);          
        }
    }
}
