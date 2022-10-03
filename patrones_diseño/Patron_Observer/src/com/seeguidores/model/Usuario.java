package com.seeguidores.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona implements Sujeto{
    private String nombre;
    private String apellido;
    private  Boolean subirFoto;
    private List<Observador> seguidores;

    public Usuario(String nombre, String apellido, String nombre1, String apellido1, Boolean subirFoto) {
        super(nombre, apellido);
        this.nombre = nombre1;
        this.apellido = apellido1;
        this.subirFoto = false;
        this.seguidores = new ArrayList<Observador>();
    }

        @Override
        public void agregarFoto() {
            System.out.println("Subi una foto nueva");
            subirFoto = true;
            notificar();
        }

        @Override
        public void eliminarFoto() {
            System.out.println("elimine una foto");
            subirFoto = false;
        }

        @Override
        public void notificar() {
            for (Observador seguidor: seguidores) {
                seguidor.actualizar(this);

            }

        }

        public String getNombre(){
        return super.getNombre();
        }


}

