package com.juego.models.state;

public class Main {
    public static void main(String[] args) {

        Tamagochii tamagochii = new Tamagochii(new Hambriento());

        Tamagochii tamagochii2 = new Tamagochii(new Hambriento());

        tamagochii.mostrarEstado();

    }


}
