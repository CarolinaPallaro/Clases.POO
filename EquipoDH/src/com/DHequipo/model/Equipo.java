package com.DHequipo.model;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre, List<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
        //this.jugadores = new ArrayList<Jugador>();
    }

    public Equipo(String nombre){
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }


    public void  agregarJugador(Jugador jugador){
        jugadores.add(jugador);
        System.out.println("Se agrega jugador: " + jugador.toString());
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

        // contabilizar jugadores lesionados

    public Integer cantidadLesionados(){
        int jugadoresLesionados = 0;

        for (Jugador j : jugadores ) {

            if(j.getEstaLesionado() && j.getEstitular())
                jugadoresLesionados++;

        }
        return jugadoresLesionados;
    }


    public void  mostrarJugadoresTitulares(){

        ArrayList<Jugador> titulares = new ArrayList<Jugador>();

        System.out.println("--- todos---");

        for (Jugador j : jugadores) {
            if(j.getEstitular())
                titulares.add(j);
            System.out.println(j.toString());

        }
        // a sort le debemos aclarar de donde devemos comparar -->(clase jugador)

        titulares.sort(Jugador::compareTo);

        System.out.println("...Titulares ordenados...");
        for (Jugador j: jugadores) {
            System.out.println(j.toString());

        }
    }


}
