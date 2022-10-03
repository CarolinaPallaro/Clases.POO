package Models.Satate;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private  Estado estadoActual;
    private final List<Producto> productos;


    public Carrito(Estado estadoActual, List<Producto> productos) {
        this.estadoActual = estadoActual;
        this.productos = new ArrayList<Producto>();}



    public boolean productosCarrito (Producto productos){
            if (Estad) {

            }
            Producto.add(productos);

    }

        public void cancelarCarrito () {
            estadoActual.cancelar();
        }
        ;


        public void volver () {
            estadoActual.volver();
        }
        ;


        public void siguiente () {
            estadoActual.siguiente();
        }
        ;

    public Estado getEstadoActual() {
        return estadoActual;
    }

    ////
////
////    public void setEstadoActual(Estado ) {
////      this.estadoActual = estadoActual;
////    }
//    }
//
////    public ArrayList<Producto> getAgregandoProductos() {
////        return agregandoProductos;
////    }
////
////    public void setAgregandoProductos(ArrayList<Producto> agregandoProductos) {
////        this.agregandoProductos = agregandoProductos;
////    }
////
////    public List<Producto> getProductos() {
////        return productos;
////    }
}
