package Models.Satate;

public class Vacio implements Estado{

    private Carrito c;


    @Override
    public void agregar(Producto productos) {

            System.out.println("El carrito esta vacío, puede comenzar a comprar");


    }

    @Override
    public void cancelar() {

    }

    @Override
    public void volver() {

    }

    @Override
    public void siguiente() {


    }
}


