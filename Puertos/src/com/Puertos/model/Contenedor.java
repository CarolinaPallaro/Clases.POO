package com.Puertos.model;

public class Contenedor implements Comparable <Contenedor>{
    private Integer identificador;
    private String paisProcedencia;
    private Boolean esPeligroso;

    public Contenedor(Integer identificador, String paisProcedencia, Boolean esPeligroso) {
        this.identificador = identificador;
        this.paisProcedencia = paisProcedencia;
        this.esPeligroso = esPeligroso;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public Boolean getEsPeligroso() {
        return esPeligroso;
    }


    @Override
    public int compareTo(Contenedor otroContenedor) {
       return this.identificador.compareTo(otroContenedor.identificador);
    }
}
