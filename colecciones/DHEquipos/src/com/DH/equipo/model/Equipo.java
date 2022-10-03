package com.DH.equipo.model;

import com.DH.equipo.exception.EquipoException;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> plantel;

    public static final String DELANTERO = "del";
    public static final String MEDIOCAMPISTA = "mdc";
    public static final String DEFENSOR = "def";
    public static final String ARQUERO = "arq";
    public static final String AGUATERO = "ag";
    public static final String COCINERO = "cc";

    public Equipo(String nombre) {
        this.nombre = nombre;
        plantel = new ArrayList<Jugador>();
    }

    public void agregarJugador(Jugador jugador) throws EquipoException {
        if(!(posicionesValidas().contains(jugador.getPosicion()))){
            throw new EquipoException(jugador.getPosicion() + " no es una posicion valida");
        }
        plantel.add(jugador);
    }

    public Integer cantJugadores(String posicion) throws EquipoException{

        // rompe !!!
        if(!(posicionesValidas().contains(posicion))){
            throw new EquipoException(posicion + " no es una posicion valida");
        }

        Integer jugadoresEnPosicion = 0;

        for(Jugador jugador : plantel){
            if(jugador.getPosicion().equals(posicion)){
                jugadoresEnPosicion++;
            }
        }

        return jugadoresEnPosicion;
    }

    public List<Jugador> reserva() throws EquipoException {

        if(plantel.size() < 5)
            throw new EquipoException("cantidad de jugadores insuficientes");

        List<Jugador> reserva = new ArrayList<Jugador>();

        for (int i = plantel.size()-5; i < plantel.size() ; i++) {
            reserva.add(plantel.get(i));
        }

        return reserva;
    }

    private List<String> posicionesValidas(){
        List<String> posicionesValidas = new ArrayList<String>();
        posicionesValidas.add(DELANTERO);
        posicionesValidas.add(MEDIOCAMPISTA);
        posicionesValidas.add(DEFENSOR);
        posicionesValidas.add(ARQUERO);
        posicionesValidas.add(AGUATERO);
        posicionesValidas.add(COCINERO);
        return posicionesValidas;
    }

}
