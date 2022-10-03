package com.Vehiculos.clases;

public class VehiculoCamion extends Vehiculo implements Comparable <VehiculoCamion>{
    private Integer cantidadEjes;
    private Double toneladas;

    public VehiculoCamion(Duenio duenio, Integer fechaAdquisicion, Double cotizacion, String marca, String patente, Integer cantidadEjes, Double toneladas) {
        super(duenio, fechaAdquisicion, cotizacion, marca, patente);
        this.cantidadEjes = cantidadEjes;
        this.toneladas = toneladas;
    }

    public Double getToneladas() {
        return toneladas;
    }

    //@Override
    //public int compareTo(VehiculoCamion o) {
      //  if (this.toneladas < o.toneladas) return -1;
        //else if (this.toneladas > o.toneladas) {
          //  return 1;

        //} else return 0;
    //}


    @Override
    public int compareTo(VehiculoCamion o) {
        return toneladas.compareTo(o.toneladas);
    }



}
