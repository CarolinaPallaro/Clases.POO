package comDH.claseViernes.com;


/*import java.util.Scanner;


public class DHClaseViernes {



    public class Desafio1 {

        public static void main (String[] args)
        {
            Scanner input = new Scanner(System.in);

            String player1;
            String player2;
            int piedra = 1;
            int papel = 2;
            int tijera = 3;



            System.out.println("Player 1: ");
            player1 = input.next();

            System.out.println("Player 2: ");
            player2 = input.next();


        }


        }

    }
/*
/*

// RESOLUCION EN CLASE
package com.DH.Patitas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        // pedir nombre del perro
        String nombre = devolverNombreMayuscula();

        // pedir cantidad de comida del perro
        System.out.println("cuantos Kg come ?");
        Double alimentoNecesario = teclado.nextDouble();

        // crear una funcion que calcule cuantos paquetes
        Integer paquetes = cuantosPaquetes(alimentoNecesario);

        // informar paquetes
        System.out.println(nombre + " consume " + paquetes + " paquetes");

    }

    private static Integer cuantosPaquetes(Double comidaNecesaria){

        Double comidaActual = 0.0;
        Integer cantidadPaquetes = 0;
        while (comidaActual < comidaNecesaria){
            // preguntar los kilos del paquete de comida
            System.out.println("cuanto pesa el paquete");
            Double pesoPaquete = teclado.nextDouble();
            comidaActual += pesoPaquete;
            cantidadPaquetes++;
        }

        return cantidadPaquetes > 10 ? 1 : 2;
    }

    private static String devolverNombreMayuscula(){
        // pedir nombre del perro
        System.out.println("nombre: ");
        return teclado.next().toUpperCase();
    }

}

 */

