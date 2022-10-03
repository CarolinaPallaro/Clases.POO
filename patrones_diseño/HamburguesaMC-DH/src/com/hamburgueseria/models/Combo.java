package com.hamburgueseria.models;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable{
    private List<Comprable> comprables;
    private Double descuento; //porcentaje de 0.0 --> 1.0

    public Combo(Double descuento) {
        this.descuento = 1-(descuento/100.0);
        comprables = new ArrayList<Comprable>();
    }
    
    public void agregarComprable(Comprable comprable){
        comprables.add(comprable); //-->q viene x parametro 
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        System.out.println("estoy recorriendo un combo");
        for (Comprable c :comprables) {
            precioTotal += c.calcularPrecio();
        }
        // c vale por cada elemento de lista q puede ser procucto o combo
        //c es el elemento en el q se aloja en cada vuelta
        precioTotal *= descuento;
        System.out.println("termine de recorrer un combo, el precio es $ " + precioTotal);
        return  precioTotal;
    }
}
