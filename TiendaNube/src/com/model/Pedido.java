package com.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

    private LocalDate fecha;
    private String nombre;
    private Integer codigo;
    
    private ArrayList<Articulo> articulos;

    public Pedido(LocalDate fecha, String nombre, Integer codigo, ArrayList<Articulo> articulos) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.codigo = codigo;
        articulos =  new ArrayList<Articulo>(articulos);
    }


}
