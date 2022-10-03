
package com.DH;
public class Cliente{

    private Integer numCliente;
    private  String nombre;
    private  Double deuda;

    public Cliente( Integer numCliente, String nombre){
        this.numCliente = numCliente;
        this.nombre = nombre;
        deuda = 0,0;
    }

    public Cliente( Integer numCliente, String nombre){
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.deuda = deuda;
    }


    public void  incrementadorDeuda(Double monto){
        System.out.println("tenias una deuda de " + deuda);
        this.deuda += monto;
        System.out.println("te preste " + deuda + "tu nueva deuda es de " + deuda);

    }


}
