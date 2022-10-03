package models;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<OfertaAcademica> oferta;

    public Instituto() {
        oferta = new ArrayList<>();
    }

    public void addCursoOPrograma(OfertaAcademica cursoOPrograma) {
        this.oferta.add(cursoOPrograma);
    }

    public void generarInforme() {
        for (OfertaAcademica oa : oferta) {
            System.out.println("El nombre es " +  oa.getName());
            System.out.println("El precio es " +  oa.getPrecio());
        }
    }
}