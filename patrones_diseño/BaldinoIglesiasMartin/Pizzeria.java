import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;

    private List<Pizza> pizzas = new ArrayList<Pizza>();

    public Pizzeria(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregarPizza(Pizza x){
        pizzas.add(x);
    }

    public void mostrarPizzas(){
        int i = 0;
        while (i< pizzas.size())
        {

            System.out.println("Pizza de " + pizzas.get(i).getNombre() + " tiene un precio de $" + pizzas.get(i).calcularPrecio());
            i++;
        }

    }
}
