package BancoParcial.Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ContratoMensual extends Contrato {
    private Double salario;
    private Double horasTotales;

    private String cargo;

    private ArrayList list;


    public ContratoMensual(Persona persona, Integer duracionMeses, Boolean sellado, LocalDate fechaInicio, Double salario, Double horasTotales, String cargo) {
        super(persona, duracionMeses, sellado, fechaInicio);
        this.salario = salario;
        this.horasTotales = horasTotales;
        this.cargo= cargo;
    }

    public Boolean esJefe() {
        return Objects.equals(cargo, "Jefe");

    }

    @Override
    public int compareTo(Contrato c) {
        if (this.horasTotales > ((ContratoMensual) c).horasTotales)
            return 1;
        else if (this.horasTotales < ((ContratoMensual) c).horasTotales) {
            return -1;
        } else return 0;
    }

    //public int compareTo(Contrato c) {
    //       if(this.horasTotales > ((ContratoMensual) c).horasTotales);
    //    }


    public String getCargo() {
        return cargo;
    }
}
