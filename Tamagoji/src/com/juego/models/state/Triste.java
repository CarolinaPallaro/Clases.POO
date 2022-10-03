package com.juego.models.state;

public class Triste implements Estado{

    @Override
    public  Estado comer(){
        System.out.println("Estoy re enojado");
        return this;
    }

    @Override
    public  Estado beber(){
        System.out.println("al artefacto se tilda");

        return null;
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
