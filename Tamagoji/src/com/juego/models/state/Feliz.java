package com.juego.models.state;

public class Feliz implements Estado {

    @Override
    public  Estado comer(){
        return new Sediento();
    }

    @Override
    public  Estado beber(){
        return new Hambriento();
    }

    @Override
    public  Estado mimar(){
        return this;
    }

    @Override
    public Estado curar() {
        return null;
    }
}
