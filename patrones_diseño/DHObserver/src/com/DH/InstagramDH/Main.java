package com.DH.InstagramDH;

import com.DH.InstagramDH.model.Observador;
import com.DH.InstagramDH.model.Seguidor;
import com.DH.InstagramDH.model.Usuario;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Clara", "Zuliani");

        Seguidor seguidor1 = new Seguidor("Leonel", "Messi");
        Seguidor seguidor2 = new Seguidor("Carlos", "Jimenez");


        usuario.agregarSeguidor(seguidor1);
        usuario.agregarSeguidor(seguidor2);
        usuario.agregarSeguidor(new Observador() {
            @Override
            public void actualizar(Usuario sujeto) {
                System.out.println("Felicitaciones");
            }
        });

        usuario.agregarFoto();

    }
}
