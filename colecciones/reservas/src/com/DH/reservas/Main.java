package com.DH.reservas;

import com.DH.reservas.models.Empresa;
import com.DH.reservas.models.Recorrido;
import com.DH.reservas.models.Reserva;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Recorrido reco1 = new Recorrido("Buenos Aires", "Lujan");
        Recorrido reco2 = new Recorrido("Buenos Aires", "Bragado");

        ArrayList<Reserva> listaReservas = new ArrayList<>();
        listaReservas.add(new Reserva("1", reco1, 3));
        listaReservas.add(new Reserva("2", reco1, 5));
        listaReservas.add(new Reserva("3", reco2, 2));

        Empresa empresa = new Empresa(listaReservas);

        try {
            System.out.println(empresa.cantVecesRecorrida("Buenos Aires"));
            System.out.println(empresa.recaudacionTotal());
            System.out.println(empresa.cantVecesRecorrida("Buenos Aire435s"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
