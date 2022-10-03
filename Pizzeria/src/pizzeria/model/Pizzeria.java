package pizzeria.model;

import pizzeria.exception.PizzaFactoryException;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private List<Pizza> carta;

    public Pizzeria() {
        carta = new ArrayList<Pizza>();
    }

    public void agregarPizzaCarta(String codigo){
        try{
            carta.add(PizzaFactory.getInstance().crearPizza(codigo));
        }
        catch (PizzaFactoryException e) {
            e.printStackTrace();
        }
    }
    public void generarInforme(){
        for (Pizza p : carta) {
            System.out.println("Nombre " + p.getNombre() + " Precio $ " + p.calcularPrecio());
        }
    }
}
