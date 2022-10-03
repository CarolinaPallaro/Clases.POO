package BancoParcial.Clases;

import java.time.LocalDate;

public class ContratoPorHora extends Contrato{
    private Integer cantidadHoras;
    private Double valorHoras;

    public ContratoPorHora(Persona persona, Integer duracionMeses, Boolean sellado, LocalDate fechaInicio, Integer cantidadHoras, Double valorHoras) {
        super(persona, duracionMeses, sellado, fechaInicio);
        this.cantidadHoras = cantidadHoras;
        this.valorHoras = valorHoras;
    }



    @Override
    public int compareTo(Contrato c) {
        return this.cantidadHoras.compareTo(((ContratoPorHora)c).cantidadHoras);
    }
}
