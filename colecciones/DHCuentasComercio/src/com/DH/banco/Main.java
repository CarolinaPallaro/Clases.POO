package com.DH.banco;

import com.DH.banco.exceptions.ClienteException;
import com.DH.banco.exceptions.CuentaException;
import com.DH.banco.model.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("pepe", "argento", "12365498", 500.0, 2000.0, 1000.0);

        try {
            System.out.println(cliente.saldarDeuda(5000.0));
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch (ClienteException e){
            e.printStackTrace();
        }
        catch (CuentaException e) {
            e.printStackTrace();
        } finally {
            System.out.println("se ejecuto saldarDeuda de Cliente");
        }


//        ArrayList<Integer> numeros = new ArrayList<>();
//        numeros.add(8);
//        numeros.add(2);
//        numeros.add(3);
//
//        try {
//            System.out.println(numeros.get(6));
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//
        System.out.println("llegue hasta aca");


    }
}
