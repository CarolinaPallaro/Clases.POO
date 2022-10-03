package BarcosDH.modelos;

import BarcosDH.modelos.Capitan;

public abstract class Embarcacion {
    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private  Integer anioFabricacion;
    private Double eslora;


    public Embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public abstract Double actualizarValor(Integer anio);

    public Double calcularMontoAlquiler(){
        Double precioFinal= precioBase;
        if(anioFabricacion >2020)
            precioFinal += valorAdicional;
        return precioFinal;
    }

    public  Double getPrecioBase(){
        return precioBase;
    }

    public void setPrecioBase() {

    }
}


