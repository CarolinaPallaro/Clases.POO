package BancoParcial.Clases;

import java.time.LocalDate;

public abstract  class Contrato implements Comparable<Contrato>{


    private Persona persona;
    private Integer duracionMeses;
    private Boolean sellado;
    private LocalDate fechaInicio;

    public Contrato(Persona persona, Integer duracionMeses, Boolean sellado, LocalDate fechaInicio) {
        this.persona = persona;
        this.duracionMeses = duracionMeses;
        this.sellado = sellado;
        this.fechaInicio = fechaInicio;
    }

    @Override
    public abstract int compareTo(Contrato c);
}
