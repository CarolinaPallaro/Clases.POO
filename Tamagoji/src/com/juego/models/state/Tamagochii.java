package com.juego.models.state;

public class Tamagochii {

    private Estado estadoActual;

    public Tamagochii(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

    public void darDeComer(){
        estadoActual.comer();
    }


    public void darBeber(){
        estadoActual.beber();

    }
    public void darMimos(){
        estadoActual.mimar();

    }

    public void mostrarEstado(){
        System.out.println(estadoActual.getClass().toString());
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }
}
