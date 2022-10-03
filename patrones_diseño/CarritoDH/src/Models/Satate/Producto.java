package Models.Satate;

import java.util.List;

public class Producto {

    private final String description;

    private final Double precio;


    public Producto(String description, Double precio) {
        this.description = description;
        this.precio = precio;
    }



    @Override
    public String toString() {
        return "Producto{" +
                "description='" + description + '\'' +
                ", precio=" + precio +
                '}';
    }
}
