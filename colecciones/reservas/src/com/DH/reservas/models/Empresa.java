package com.DH.reservas.models;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Reserva> reservas;

    public Empresa(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Double recaudacionTotal() {
        Double total = 0.0;

        for (Reserva r : reservas) {
            total += r.calcularPrecioReserva();
        }

        return total;
    }

    public Integer cantVecesRecorrida(String estacion) throws Exception {
        if (!Recorrido.estaciones.contains(estacion))
            throw new Exception("La pifiaste");

        Integer contador = 0;

        for (Reserva r : reservas) {
            if (r.getRecorrido().getDestino().equals(estacion)
            || r.getRecorrido().getPartida().equals(estacion))
                contador++;
        }

        return contador;
    }
}
