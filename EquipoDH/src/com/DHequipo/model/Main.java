package com.DHequipo.model;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Jugador jugador1 = new Jugador(20, "Juam", true, false);
        Jugador jugador2 = new Jugador(21, "Peron", true, true);
        Jugador jugador3 = new Jugador(22, "Pipo", false, true);


         Equipo equipo1 = new Equipo ("Atlanta");


         equipo1.agregarJugador(jugador1); //0
         equipo1.agregarJugador(jugador2); //1
         equipo1.agregarJugador(jugador3); //2

        List<Jugador> jugadores = equipo1.getJugadores();

         // Agregar jugadores size ciclo For

        // for(int i = 0; i < jugadores.size(); i++){
        //  jugadores.get(i).toString(); }


        //foreach

        for (Jugador j: jugadores) {
            System.out.println(j.toString());

        }
        System.out.println("Lesionados: " + equipo1.cantidadLesionados());
        System.out.println("\n --- JUGADORES---");

    }

    // para barra invertida Alt + 92 Tec.numerico
}
