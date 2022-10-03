package com.DH.InstagramDH.model;

public class Seguidor extends Persona implements Observador{

    private Integer cantNotificaciones;

    public Seguidor(String nombre, String apellido) {
        super(nombre, apellido);
        cantNotificaciones = 0;
    }

    @Override
    public void actualizar(Usuario sujeto) {
        cantNotificaciones++;
        System.out.println(getNombre() + " fue notificado de la foto de " + sujeto.getNombre());
    }
}
