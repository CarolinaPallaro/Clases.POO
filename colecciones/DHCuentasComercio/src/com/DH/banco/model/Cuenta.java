package com.DH.banco.model;

import com.DH.banco.exceptions.CuentaException;

public class Cuenta {

    public void mensaje() throws CuentaException {
        System.out.println("soy una cuenta");
        throw new CuentaException("cuenta rompiendo");
    }

}
