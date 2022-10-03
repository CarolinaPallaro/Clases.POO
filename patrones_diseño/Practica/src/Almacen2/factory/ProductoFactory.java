package Almacen2.factory;

import Almacen2.models.Empanada;
import Almacen2.models.Pizza;
import Almacen2.models.Producto;
import Almacen2.pizzeriaException.PizzeriaException;

public class ProductoFactory {


    //Esto es igual para todos los FACTORY
    private static ProductoFactory instance;

    public static final String PIZZA = "Pizza Comun";
    public static final String EMPANADA = "Empanada";
    public static final String PIZZAMORRON = "PIZZAMORRON";


    private ProductoFactory(){

    }

    public static ProductoFactory getInstance(){
        if(instance == null)
            instance = new ProductoFactory();
        return instance;
    }

    public Producto crearProducto(String codigo) throws PizzeriaException {
        switch (codigo){
            case PIZZA :
                return new Pizza(300.0,"Muzzarella","grande","Muzza");
            case EMPANADA:
                return new Empanada(290.0,"Carne","zapato");
            case PIZZAMORRON:
                return new Pizza(3000.0,"amorronada","Chica","Morron");
            default:
                throw new PizzeriaException("No existe, flashaste pa");
        }

    }
}
