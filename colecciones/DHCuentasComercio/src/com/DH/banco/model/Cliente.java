package com.DH.banco.model;

import com.DH.banco.exceptions.ClienteException;
import com.DH.banco.exceptions.CuentaException;

public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    private Double saldo;
    private Double deuda;
    private Double limite;
    private Cuenta cuenta;

    public Cliente(String nombre, String apellido, String DNI, Double saldo, Double deuda, Double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.saldo = saldo;
        this.deuda = deuda;
        this.limite = limite;
        cuenta = new Cuenta();
    }

    public void comprar(Double importe) throws ClienteException {
        if(importe <= limite){
            saldo -= importe;
        }else {
            throw new ClienteException("queres comprar algo de " + importe + " y tu limite es de " + limite);
        }
    }

    public Double saldarDeuda(Double importe) throws ClienteException, CuentaException {
        cuenta.mensaje();
        if(deuda < importe){
            throw new ClienteException("tu deuda es de " + deuda + " y estas intentando pagar " + importe);
        }
        deuda -= importe;
        return deuda;
    }

}
