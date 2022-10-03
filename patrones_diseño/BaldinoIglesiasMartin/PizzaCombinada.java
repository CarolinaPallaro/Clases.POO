import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{

    private List<PizzaSimple> combinada = new ArrayList<>();

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);

    }

    @Override
    public double calcularPrecio() {
        double acumulador = 0.00;
        int i = 0;
        while (i< combinada.size())
        {
            acumulador += combinada.get(i).calcularPrecio();
            i++;
        }

        return acumulador/i;

    }
    public void agregarPizza(PizzaSimple x){

        this.combinada.add(x);
    }
}
