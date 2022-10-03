package com.DHequipo.model;

public class Jugador implements Comparable <Jugador>{
    private Integer nroCamiseta;
    private String nombre;
    private Boolean estaLesionado;
    private Boolean estitular;

    public Jugador(Integer nroCamiseta, String nombre, Boolean estaLesionado, Boolean estitular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.estaLesionado = estaLesionado;
        this.estitular = estitular;
    }


    // viene de objet

    @Override
    public String toString() {
        return "Jugador{" +
                "nroCamiseta=" + nroCamiseta +
                ", nombre='" + nombre + '\'' +
                ", estaLesionado=" + estaLesionado +
                ", estitular=" + estitular +
                '}';
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }

    public boolean getEstitular() {
        return estitular;
    }

    public Integer getNroCamiseta() {
        return nroCamiseta;
    }


    // como int sabe compararse no hace falta usar if
    @Override
    public int compareTo(Jugador otroJugador) {

        return nroCamiseta.compareTo(otroJugador.getNroCamiseta());

    }


    //@Override
    // public int compareTo(Jugador otroJugador) {
    //   if( nroCamiseta > otroJugador.nroCamiseta) return 1;

    //   else if (nroCamiseta < otroJugador.nroCamiseta) return -1;

    //   return 0; }
}
