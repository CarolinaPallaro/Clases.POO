package com.DH.equipo;

import com.DH.equipo.exception.EquipoException;
import com.DH.equipo.model.Equipo;
import com.DH.equipo.model.Jugador;

public class Main {
    public static void main(String[] args) {

        Equipo belgrano = new Equipo("Belgrano");
        Equipo instituto = new Equipo("Instituto");

        Jugador messi = new Jugador("Messi", 30, Equipo.DELANTERO);
        Jugador merino = new Jugador("Merino", 1, "ARQUERO");
        Jugador dimaria = new Jugador("DiMaria", 10, "MEDIOCAMPISTA");
        Jugador delafuente = new Jugador("Delafuente", 3, "DELANTERO");
        Jugador neymar = new Jugador("Neymar", 4, Equipo.DELANTERO);
        Jugador depaul = new Jugador("Depaul", 4, "MEDIOCAMPISTA");
        Jugador paredes = new Jugador("Paredes", 5, "MEDIOCAMPISTA");
        Jugador abbondanzieri = new Jugador("Abbondanzieri", 13, "ARQUERO");


        try {
            belgrano.agregarJugador(messi);
            belgrano.agregarJugador(merino);
            belgrano.agregarJugador(dimaria);
            belgrano.agregarJugador(delafuente);
            belgrano.agregarJugador(neymar);
            belgrano.agregarJugador(depaul);
            belgrano.agregarJugador(paredes);
            belgrano.agregarJugador(abbondanzieri);
        } catch (EquipoException e) {
            e.printStackTrace();
        }

        try {
            belgrano.cantJugadores(Equipo.DEFENSOR);
        } catch (EquipoException e) {
            e.printStackTrace();
        }

        try {
            belgrano.reserva();
        } catch (EquipoException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("fin del programa DH_Equipos");
    }
}
