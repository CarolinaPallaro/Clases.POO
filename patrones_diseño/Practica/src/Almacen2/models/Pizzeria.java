package Almacen2.models;

import Almacen2.factory.ProductoFactory;
import Almacen2.pizzeriaException.PizzeriaException;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private List<Producto> productos;

    public Pizzeria() {
        this.productos = new ArrayList<Producto>();
    }

//    Para cargar productos
    public void agregarProducto(String codigo){
        try {
            productos.add(ProductoFactory.getInstance().crearProducto(codigo));
        } catch (PizzeriaException e) {
            System.err.println(codigo + " "+ e.getMessage());
        }

    }

    public void cantidadProductos(){
        Integer cantidadEmpanadas = 0;
        Integer cantidadPizzas = 0;

        for (Producto p: productos) {
            if (p instanceof Empanada){
                cantidadEmpanadas++;
            }else cantidadPizzas++;

        }
        System.out.println("Cantidad de empanadas es: " + cantidadEmpanadas + " y \n pizzas: " + cantidadPizzas) ;

    }

}
