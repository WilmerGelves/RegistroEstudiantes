package com.registroestudiante;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        registro(); 
    }

    public static void registro(){
        try {
            Scanner sc = new Scanner(System.in); //Creación del buffer de entrada.

            Set<String> estudiantes = new HashSet<>();
            int cantEstudiantes;
            String nameStudent;
            boolean search;
            System.out.print("Cantidad de estudiantes-> ");
            cantEstudiantes = sc.nextInt();
            sc.nextLine();//formatero del buffer

            for(int i = 0 ; i < cantEstudiantes ; i++){
                System.out.print("Estudiante N°" + (i+1) + "-> ");
                nameStudent = sc.nextLine().toLowerCase().trim();
                estudiantes.add(nameStudent);
            }

            //Recorrido de la colección con un for-each
            System.out.println("\nEstudiantes:"); 
            for (String nombre : estudiantes) {
                System.out.println(nombre);
            }
            

            //Busqueda un estudiante mediante el método contains
            System.out.println("\nNombre del estudiante a buscar: ");
            nameStudent = sc.nextLine().toLowerCase().trim();
            search = estudiantes.contains(nameStudent);
            
            //Uso de operador ternario.
            String mensaje = (search == true)? "El/LA estudiante esta en la lista":"No se encuentró al estudiante";
            System.out.println(mensaje);
            sc.close();
        } catch (Exception e) {
            System.out.println("Introdujo datos erróneos,intentelo nuevamente.");
            registro();
        }
    }
}