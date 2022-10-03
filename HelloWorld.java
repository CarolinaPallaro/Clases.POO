package com.DH.HelloWorld;

import com.DH.HelloWorld.model.Cliente;

public class HelloWorld {
    public static void main(String[] args) {
        Integer entero=3;
        String texto="HelloWorld";
        Cliente cliente1=new Cliente();

        cliente1.nombre = "Diego";
        cliente1.telefono = 953428;
        cliente1.informar();

        switch (entero){
            case 0:


            case 1:
                System.out.println(texto.toLowerCase());
                break;
            default:
                System.out.println(texto.toUpperCase());

        }

    }
}
