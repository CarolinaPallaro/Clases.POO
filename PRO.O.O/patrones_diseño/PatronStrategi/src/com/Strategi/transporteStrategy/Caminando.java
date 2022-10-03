package com.Strategi.transporteStrategy;

public class Caminando implements TransporteStrategy{
    @Override
    public Double calcularTiempo(Double distancia) {
        return distancia/ 0.2456 * 13;
    }
}
