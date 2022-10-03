package com.company;

public class Main {

    public static void main(String[] args) {

        try {
            Fecha1 pruebaFecha = new Fecha1(1,5,10);

        }catch (FechaException e){
            e.printStackTrace();

        }

    }
}
