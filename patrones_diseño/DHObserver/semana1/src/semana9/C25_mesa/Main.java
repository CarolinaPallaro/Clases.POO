package semana9.C25_mesa;

import semana9.C25_mesa.model.Oferente;
import semana9.C25_mesa.model.Subasta;

public class Main {
    public static void main(String[] args) {
        Subasta subastamosTodo = new Subasta(1000.0,"monitor");
        Oferente vangie = new Oferente("Evangelina", "Brune", 123, 10000.0);
        Oferente marce = new Oferente("Marce", "Brune", 123, 20000.0);
        subastamosTodo.agregarSubastadores(vangie);
        subastamosTodo.agregarSubastadores(marce);
        subastamosTodo.notificar();
    }
}
