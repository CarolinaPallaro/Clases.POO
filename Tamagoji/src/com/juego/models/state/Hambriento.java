package com.juego.models.state;

public class Hambriento implements Estado{


    @Override
    public  Estado comer(){
        return new Feliz();
    }

    @Override
    public  Estado beber(){
        return new Triste();
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
