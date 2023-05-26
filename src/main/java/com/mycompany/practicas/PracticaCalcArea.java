/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas;

import java.util.Scanner;

/**
 *
 * @author Santiago Developer
 */
public class PracticaCalcArea {

    public static void main(String[] args) {

        double radio;
        String usuario;

        Scanner leer = new Scanner(System.in);

        System.out.println("Cálculo del Área de una Esfera");

        System.out.println("Ingrese su nombre de usuario: ");
        usuario = leer.next();

        System.out.println("Bienvenido, " + usuario);

        System.out.println("Ingrese el radio de la esfera: ");
        radio = leer.nextDouble();

        double area = 4 * Math.PI * Math.pow(radio, 2);

        System.out.println("El área de la esfera es: " + area);

    }

}
