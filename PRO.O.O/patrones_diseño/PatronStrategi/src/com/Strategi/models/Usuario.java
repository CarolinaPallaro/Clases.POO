package com.Strategi.models;

import com.Strategi.transporteStrategy.TransporteStrategy;

public class Usuario {

    private Punto ubicacionActual;

    public Usuario(Punto ubicacionActual) {
        this.ubicacionActual = ubicacionActual;
    }

    public  Double cuantoTarde(Punto ubicacionDestino, TransporteStrategy estrategia){
    return  estrategia.calcularTiempo(ubicacionActual.calcularDistancia(ubicacionDestino));
    }
}
