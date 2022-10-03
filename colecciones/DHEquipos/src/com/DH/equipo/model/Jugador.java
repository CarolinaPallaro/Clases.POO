package com.DH.equipo.model;

public class Jugador {
    private String apellido;
    private Integer nroCamiseta;
    private String posicion;

    public Jugador(String apellido, Integer nroCamiseta, String posicion) {
        this.apellido = apellido;
        this.nroCamiseta = nroCamiseta;
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }
}
