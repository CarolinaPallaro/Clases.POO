package com.DHbanco.model;

public class Cliente {
    //ATRIBUTOS
    private String  apellido;
    private Integer numCliente;
    private Integer dni;
    private  Integer cuit;

    public Cliente(String apellido, Integer numCliente, Integer dni, Integer cuit) {
        this.apellido = apellido;
        this.numCliente = numCliente;
        this.dni = dni;
        this.cuit = cuit;
    }
}
