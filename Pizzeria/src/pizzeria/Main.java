package pizzeria;

import pizzeria.model.PizzaFactory;
import pizzeria.model.Pizzeria;

public class Main {
    public static void main(String[] args) {
        Pizzeria pizzaLoca = new Pizzeria();
        pizzaLoca.agregarPizzaCarta(PizzaFactory.COD_ESPECIAL);
        pizzaLoca.agregarPizzaCarta(PizzaFactory.COD_ANANA);
        pizzaLoca.agregarPizzaCarta(PizzaFactory.COD_MUZZARELLA);
        pizzaLoca.agregarPizzaCarta(PizzaFactory.COD_COMBINADA_LOCA);
        pizzaLoca.agregarPizzaCarta(PizzaFactory.COD_MUZZA_GRANDE);
        pizzaLoca.agregarPizzaCarta("yoquese");
        pizzaLoca.generarInforme();
    }
}
