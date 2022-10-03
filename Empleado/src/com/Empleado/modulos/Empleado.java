package com.Empleado.modulos;

public class Empleado {
    private String nombre;
    private String apellido;
    private Double sueldo;

    public Empleado(String nombre, String apellido, int sueldo) {

        if(nombre == null || nombre.equals("")){
            throw new RuntimeException("Nombre no puede estar vacío");
        }

        if(apellido == null || apellido.equals("")){
            throw new RuntimeException("Apellido no puede estar vacio");
        }

        if(sueldo <= 0 ){
            throw new RuntimeException("Sueldo no puede ser menor o igual a cero");
        }


        this.nombre=nombre;
        this.apellido=apellido;
        this.sueldo= Double.valueOf(sueldo);
    }




    //throw new EmpleadoException("Apellido no puede estar vacio");
            //throw new EmpleadoException("Nombre no puede estar vacio");

           //  ||a != null || s !=0 ) {

        }



    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Double getSueldo() {
        return sueldo;
    }
}
