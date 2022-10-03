package com.hamburgueseria;

import com.hamburgueseria.models.Carrito;
import com.hamburgueseria.models.Combo;
import com.hamburgueseria.models.Producto;

public class Main {
    public static void main(String[] args) {

        Producto hamburguesa = new Producto("BigDH", 5.0);
        Producto papaFrita = new Producto("papasDH", 2.0);
        Producto gaseosa = new Producto("gaseosaDH", 2.0);
        Producto helado = new Producto("helado", 1.2);


        Combo combo1 = new Combo(10.0);
        combo1.agregarComprable(hamburguesa);
        combo1.agregarComprable(gaseosa);
        combo1.agregarComprable(papaFrita);

        Combo combo2 = new Combo(28.0);
        combo2.agregarComprable(combo1);
        combo2.agregarComprable(combo1);


        //aca hay 14 elementos
        Combo comboFamiliar = new Combo(15.0);
        comboFamiliar.agregarComprable(combo2);
        comboFamiliar.agregarComprable(combo1);
        comboFamiliar.agregarComprable(combo2);

        Carrito carrito1 =  new Carrito();
        carrito1.agregarItem(comboFamiliar);
        carrito1.agregarItem(combo2);
        carrito1.agregarItem(combo1);

        System.out.println("Precio Final de su compra:$ " calcu);

    }
}
