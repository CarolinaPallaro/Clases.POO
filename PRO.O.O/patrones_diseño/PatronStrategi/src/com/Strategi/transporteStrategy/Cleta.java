package com.Strategi.transporteStrategy;

public class Cleta implements TransporteStrategy{

    @Override
    public Double calcularTiempo(Double distancia) {
        return distancia / 0.05036 * 3 ;
    }
}
