package Almacen2.models;

public class Empanada extends Producto{

    private String sabor;

    public Empanada(Double precio, String nombre, String sabor) {
        super(precio, nombre);
        this.sabor = sabor;
    }


}
