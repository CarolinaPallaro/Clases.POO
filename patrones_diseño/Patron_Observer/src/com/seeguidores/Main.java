package com.seeguidores;

import com.seeguidores.model.Observador;
import com.seeguidores.model.Seguidor;
import com.seeguidores.model.Sujeto;
import com.seeguidores.model.Usuario;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Clara", "Zuliani");
        Sujeto seguidor1 = new Seguidor("Alberto", "Zoilo");

        Seguidor seguidor2 = new Seguidor("Leonel", "Messi");


        usuario.agregarSeguidor(seguidor1);
        usuario.agregarSeguidor(seguidor2);
        usuario.agregarSeguidor(new Observador() {
            @Override
            public void actualizar(Usuario sujeto) {
                System.out.println("Felicidades");
            }
        });{

        }
        usuario.agregarFoto();

    }
}
