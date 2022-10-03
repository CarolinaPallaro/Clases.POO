package com.Strategi;

import com.Strategi.models.Punto;
import com.Strategi.models.Usuario;
import com.Strategi.transporteStrategy.Automovil;
import com.Strategi.transporteStrategy.Caminando;
import com.Strategi.transporteStrategy.Cleta;
import com.Strategi.transporteStrategy.TransporteStrategy;

public class Main {
    public static void main(String[] args) {
        Punto ubicacion1 = new Punto(20.0, 50.0);
        Punto ubicacion2 = new Punto(-3.0, 60.0);
        Punto ubicacion3 = new Punto(-20.0, -20.0);

        Automovil auto = new Automovil();
        Cleta cleta = new Cleta();
        Caminando caminando =  new Caminando();

        Usuario usuario = new Usuario(ubicacion1);

        System.out.println(usuario.cuantoTarde(ubicacion2, auto));
        System.out.println(usuario.cuantoTarde(ubicacion2, new TransporteStrategy() {
            @Override
            public Double calcularTiempo(Double distancia) {
                return distancia/10;
            }
        }));

    }}
