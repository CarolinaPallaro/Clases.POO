package models;

public class Curso extends OfertaAcademica {
    private Integer cargaHoraria;
    private Double valorHora;
    private Integer mesesDuracion;

    public Curso(String name, String description, Integer cargaHoraria, Double valorHora, Integer mesesDuracion) {
        super(name, description);
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.mesesDuracion = mesesDuracion;
    }

    @Override
    public Double getPrecio() {
        return (cargaHoraria * valorHora) * mesesDuracion;
    }

    public String getNombreYPrecio() {
        return super.getName() + " " + this.getPrecio();
    }

}
