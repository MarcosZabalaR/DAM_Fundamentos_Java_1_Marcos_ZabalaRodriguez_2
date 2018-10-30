package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Bienvenido, por favor introduzca el radio para cálcular el área (Los decimales deberá expresarlos con una coma).");
        double a=scanner();
        double x=calculo(a);
        System.out.println("El área es: " +x);
    }

    /*
    Función main donde se declara el valor del radio y se imprime por pantalla
     */

    private static double scanner() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextDouble()) { //bucle para comprobar si lo introducido por el usuario son números
            System.out.println("Valor incorrecto, por favor introduzca un número");
            scan = new Scanner(System.in);
        }
        return scan.nextDouble();
    }

    /*
    Bucle while en el que se comprueba que el valor dado sea un número double
     */

    private static double calculo(double a){
        double x= Math.PI*(a*a);
        return x;
    }
    /*
    Simplemente la ecuación para resolver el área
     */
}
