package com.patronesUnoSing.model;

public class Main {
    public static void main(String[] args) {


        Singleton obj1= Singleton.getInstance();
        System.out.println(obj1.var);
        obj1.var++;
        System.out.println(obj1.var);


        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2.var);

        //Se puede usar igual sin instanciar un objeto
        //Calculo va a tener solo los estaticos
        Singleton.areaCirculo(2.0);
        Double pi = Singleton.PI;
    }
}
