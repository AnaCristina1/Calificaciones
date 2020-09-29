package com.anacristina;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String nombre, calificacion;
        Double materia1, materia2, materia3, materia4, materia5, promedio;

        System.out.println("Ingresa el nombre del estudiante:");
        nombre = sc.nextLine();
        System.out.println("Ingresa calificacion 1:");
        materia1 = sc.nextDouble();
        System.out.println("Ingresa calificacion 2:");
        materia2 = sc.nextDouble();
        System.out.println("Ingresa calificacion 3:");
        materia3 = sc.nextDouble();
        System.out.println("Ingresa calificacion 4:");
        materia4 = sc.nextDouble();
        System.out.println("Ingresa calificacion 5:");
        materia5 = sc.nextDouble();
        promedio = (materia1 + materia2 + materia3 + materia4 + materia5) / 5;

        System.out.println("Nombre del estudiante=");
        System.out.println(nombre);

        System.out.println("Calificacion 1=");
        System.out.println(materia1);

        System.out.println("Calificacion 2=");
        System.out.println(materia2);

        System.out.println("Calificacion 3=");
        System.out.println(materia3);

        System.out.println("Calificacion 4=");
        System.out.println(materia4);

        System.out.println("Calificacion 5=");
        System.out.println(materia5);

        System.out.println("Promedio=");
        System.out.println(promedio);

        System.out.println("Calificacion=");

        if (promedio <= 50) {
            System.out.print("F");
        }
        else
        if (promedio>=51 && promedio <= 60) {
            System.out.println("E");
        }
        else
        if (promedio>=61 && promedio <= 70) {
            System.out.println("D");
        }
        else
        if (promedio>=71 && promedio <= 80) {
            System.out.println("C");
        }
        else
        if (promedio>=81 && promedio <= 90) {
            System.out.println("B");
        }
        else
        if (promedio>=91 && promedio <= 100) {
            System.out.println("A");
        }

    }
}
