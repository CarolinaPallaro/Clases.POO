package com.trencito.model;

import java.util.ArrayList;
import java.util.List;

public class Vagon implements VagonCompuesto{

    private List<VagonCompuesto> compuestos;

    public Vagon() {
        compuestos = new ArrayList<>();
    }

    public void agregarCompuestos(VagonCompuesto compuesto){
        compuestos.add(compuesto);
    }

    @Override
    public Double calcularSuperficieTotal() {
        Double superficieTotal = 0.0;
        for (VagonCompuesto vc: compuestos){
            superficieTotal += vc.calcularSuperficieTotal();
        }
        return superficieTotal;
    }


}
