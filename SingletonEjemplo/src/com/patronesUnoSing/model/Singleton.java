package com.patronesUnoSing.model;

public class Singleton {

        //Static es un atributo que le doy para q solo pertenezca a la clase
    //Los estaticos no necesitan q la clase este creada.
    public static  final Double PI = 3.14;


    private static Singleton instance;


    //Esto solo para ejemplo, NO SE USA.

    public int var;

    Singleton(){

    }
    //Si la instancia no fue creada, la genero. Si lo esta, devuelvo lo q haya.
    public  static Singleton getInstance(){
        if(instance == null)

            //La primera vez vale null
            instance = new Singleton();
        return instance;
    }

    public  Double suma(Double a, Double b){
        return a + b;
    }

    public  Double resta(Double a, Double b){
        return a - b;
    }

    //static hace que el metodo pertenezca  a la clase y no al objeto
    public static Double areaCirculo (Double r){
        return  3.14*r*r;
    }
}
