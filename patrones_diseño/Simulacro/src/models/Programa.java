package models;

import java.util.ArrayList;

public class Programa extends OfertaAcademica {
    private ArrayList<OfertaAcademica> oferta;
    private Double bonificacion;

    public Programa(String nombre, String descripcion, Double bonificacion) {
        super(nombre, descripcion);
        this.oferta = new ArrayList<OfertaAcademica>();
        this.bonificacion = bonificacion;
    }

    @Override
    public Double getPrecio() {
        Double precio = 0.0;

        for (OfertaAcademica oa : oferta)
            precio += oa.getPrecio();

        return precio - (precio * (bonificacion / 100));
    }

    public void AddCursoOPrograma(OfertaAcademica cursoOPrograma) {
        this.oferta.add(cursoOPrograma);
    }
}
