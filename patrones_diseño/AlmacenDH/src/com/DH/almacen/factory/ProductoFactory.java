package com.DH.almacen.factory;

import com.DH.almacen.exception.ProductoFactoryException;
import com.DH.almacen.model.Caja;
import com.DH.almacen.model.Pelota;
import com.DH.almacen.model.Producto;

public class ProductoFactory {

    private static ProductoFactory instance;

    public static final String CAJA10X10 = "CAJA10X10";
    public static final String CAJA5X5 = "CAJA5X5";
    public static final String PELOTAFUTBOL = "PELOTAFUTBOL";
    public static final String PELOTATENNIS = "PELOTATENNIS";

    private ProductoFactory(){

    }

    public static ProductoFactory getInstance(){
        if(instance == null)
            instance = new ProductoFactory();
        return instance;
    }

    public Producto crearProducto(String codigo) throws ProductoFactoryException{
        switch (codigo){
            case "CAJA10X10":
                return new Caja(0.01, 10.0, 10.0, 10.0);
            case "CAJA5X5":
                return new Caja(0.01, 5.0, 5.0, 5.0);
            case "PELOTAFUTBOL":
                return new Pelota(0.43, 11.0);
            case "PELOTATENNIS":
                return new Pelota(0.06, 3.2);
            default :
                throw new ProductoFactoryException("codigo " + codigo + " invalido");
        }
    }

}
