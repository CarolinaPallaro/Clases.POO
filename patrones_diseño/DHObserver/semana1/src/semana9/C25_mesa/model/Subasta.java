package semana9.C25_mesa.model;

import java.util.ArrayList;
import java.util.List;

public class Subasta implements Subasta_Observado{
    private Double montoPesos;
    private String descripcion;
    private List<Oferente> subastadores;

    public Subasta(Double montoPesos, String descripcion) {
        this.montoPesos = montoPesos;
        this.descripcion = descripcion;
        subastadores = new ArrayList<Oferente>();
    }

    public void agregarSubastadores(Oferente o){
        subastadores.add(o);
    }

    @Override
    public void notificar() {
        for(Oferente o: subastadores){
            o.accionar(montoPesos);
        }
    }

    public Double getMontoPesos() {
        return montoPesos;
    }
}
