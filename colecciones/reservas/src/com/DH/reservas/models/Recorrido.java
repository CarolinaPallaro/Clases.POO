package com.DH.reservas.models;

import java.util.ArrayList;

public class Recorrido {
    private String partida;
    private String destino;

    public String getPartida() {
        return partida;
    }

    public String getDestino() {
        return destino;
    }

    public static ArrayList<String> estaciones;

    public Recorrido(String partida, String destino) {
        this.partida = partida;
        this.destino = destino;

        ArrayList<String> estacionesValidas = new ArrayList<>();
        estacionesValidas.add("Buenos Aires");
        estacionesValidas.add("Lujan");
        estacionesValidas.add("Mercedes");
        estacionesValidas.add("Suipacha");
        estacionesValidas.add("Chivilcoy");
        estacionesValidas.add("Alberti");
        estacionesValidas.add("Bragado");

        this.estaciones = estacionesValidas;
    }

    public Boolean esPuntaAPunta() {
        if ((this.estaciones.get(0).equals(this.partida) &&
            this.estaciones.get(this.estaciones.size() - 1).equals(this.destino)) ||
            (this.estaciones.get(0).equals(this.destino) &&
            this.estaciones.get(this.estaciones.size() - 1).equals(this.partida)))
            return true;

        return false;
    }
}
