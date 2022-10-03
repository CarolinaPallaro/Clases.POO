package pizzeria.model;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{
    private List<Pizza> pizzas;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.pizzas = new ArrayList<Pizza>();
    }
    @Override
    public Double calcularPrecio() {
        Double precioFinal= 0.0;
        //int contador = 0;
        for (Pizza p: pizzas){
            precioFinal += p.calcularPrecio();
            //contador++;
        }
        return precioFinal/pizzas.size();
    }

    public void agregrarPizza(Pizza p){
        pizzas.add(p);
    }
}
