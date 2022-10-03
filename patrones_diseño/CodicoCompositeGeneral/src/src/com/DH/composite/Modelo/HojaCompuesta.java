package com.DH.composite.Modelo;

import java.util.ArrayList;
import java.util.List;

public class HojaCompuesta implements ComponenteComun {

    private List<ComponenteComun> listaDeComponentes;

    public HojaCompuesta() {
        listaDeComponentes = new ArrayList<ComponenteComun>();
    }

    // Recorro una lista completa sin utilizar iteradores
    @Override
    public Double calcularPrecio() {
        Double acumulador = 0.0;
        for (ComponenteComun cc: listaDeComponentes) {
            // Este calcularPrecio de abajo, viene de la hoja simple, siempre
            acumulador += cc.calcularPrecio();
        }

        // Y acá puedo calcular el precio de la hoja compuesta
        // Si el acumulador (combo/composicion) no tiene ningun descuento o agregados al producto
        // final, devuelvo el acumulador como viene, si no hago acá cualquier agregado.

        return acumulador;
    }

    // Método para agregar composiciones/combos/conjuntos de hojas simples
    public void AgregoElementosEnUnaComposicion(ComponenteComun cc){
        listaDeComponentes.add(cc);
    }



}
