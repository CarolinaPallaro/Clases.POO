package com.Empleado.modulos;

public class Main {
    public static void main(String[] args) throws Exception {

        try {
            Empleado empleado1 = new Empleado(" ", "Perez", 2);

        } catch (EmpleadoException e){
            e.printStackTrace();
        }

    }

}


