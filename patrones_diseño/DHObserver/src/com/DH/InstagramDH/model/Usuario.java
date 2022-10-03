package com.DH.InstagramDH.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona implements Sujeto{

    private Boolean subirFoto;
    private List<Observador> seguidores;

    public Usuario(String nombre, String apellido) {
        super(nombre, apellido);
        subirFoto = false;
        seguidores = new ArrayList<Observador>();
    }

    @Override
    public void agregarSeguidor(Observador observador){
        seguidores.add(observador);
    }

    @Override
    public void agregarFoto() {
        System.out.println("subi una foto nueva");
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
        for (Observador seguidor : seguidores) {
            seguidor.actualizar(this);
        }
    }
     public String getNombre(){
        return super.getNombre();
     }
}
