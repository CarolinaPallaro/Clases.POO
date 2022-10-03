package com.DH.reservas.models;

public class Reserva {
    private String codigo;
    private Recorrido recorrido;

    public Recorrido getRecorrido() {
        return recorrido;
    }

    private Integer pasajeros;
    private final Double precioBoleto;

    public Reserva(String codigo, Recorrido recorrido, Integer pasajeros) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.pasajeros = pasajeros;
        this.precioBoleto = 50.0;
    }

    public Double calcularPrecioReserva() {
        Double precioReserva = this.pasajeros * this.precioBoleto;

        if (recorrido.esPuntaAPunta())
            precioReserva = precioReserva * 0.8;

        return precioReserva;
    }
}
