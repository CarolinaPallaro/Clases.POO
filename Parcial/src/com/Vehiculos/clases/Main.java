package com.Vehiculos.clases;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        Duenio duenio1 = new Duenio("Juana", "Perez", 151515);
        Duenio duenio2 = new Duenio("Juan", "Pipi", 191515);
        Duenio duenio3 = new Duenio("Pablo", "Escobar", 101515);


        Vehiculo vehiculo1 = new VehiculoCamion(duenio1, 2020, 5.3, "Escania", "15abc", 6, 80.0);
        Vehiculo vehiculo2 = new VehiculoCamion(duenio3, 2021, 5.3, "Escania", "16abc", 9, 81.0);
        Vehiculo vehiculo3 = new VehiculoCamion(duenio2, 2022, 5.3, "Escania", "17abc", 4, 82.0);

        Vehiculo v1 = new VehiculoAutomovil(duenio1, 2020,80.0, "Bora", "h6",5,true);



        //metodos


        System.out.println("Es nacional: " + v1.esNacional());
        System.out.println("Es nacional: " + vehiculo2.esNacional());


        //Comparacion
        System.out.println(((VehiculoCamion) vehiculo1).compareTo((VehiculoCamion) vehiculo2));










    }
}
