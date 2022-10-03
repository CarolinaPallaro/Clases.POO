package com.Vehiculos.clases;

public class VehiculoAutomovil extends Vehiculo{
    private Integer cilindrada;

    private Boolean esAGas;


    public VehiculoAutomovil(Duenio duenio, Integer fechaAdquisicion, Double cotizacion, String marca, String patente, Integer cilindrada, Boolean esAGa) {
        super(duenio, fechaAdquisicion, cotizacion, marca, patente);
        this.cilindrada = cilindrada;
        this.esAGas=esAGa;
    }

    public boolean esAGas(){
        return true;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public boolean esEconomico(){
        return getCilindrada() < 1200 || esAGas();
    }


}
