import Almacen2.factory.ProductoFactory;
import Almacen2.models.Pizzeria;
import Almacen2.models.Producto;
import Almacen2.pizzeriaException.PizzeriaException;

public class Main {
    public static void main(String[] args) throws PizzeriaException {

        Pizzeria losHijosDePuta = new Pizzeria();

        losHijosDePuta.agregarProducto(ProductoFactory.EMPANADA);
        losHijosDePuta.agregarProducto(ProductoFactory.EMPANADA);
        losHijosDePuta.agregarProducto(ProductoFactory.EMPANADA);
        losHijosDePuta.agregarProducto(ProductoFactory.EMPANADA);
        losHijosDePuta.agregarProducto(ProductoFactory.PIZZA);
        losHijosDePuta.agregarProducto(ProductoFactory.PIZZAMORRON);
        losHijosDePuta.agregarProducto("PELOTA");

        losHijosDePuta.cantidadProductos();





    }
}
