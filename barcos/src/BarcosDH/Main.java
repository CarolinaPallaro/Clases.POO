package BarcosDH;

import BarcosDH.modelos.Capitan;
import BarcosDH.modelos.Embarcacion;
import BarcosDH.modelos.Velero;
import BarcosDH.modelos.Yate;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Capitan capitan1 = new Capitan("tom", "jiji", 23444);
        Capitan capitan2 = new Capitan("tomas", "jiju", 23445);
        Capitan capitan3 = new Capitan("Jaime", "Otro", 23446);

        Embarcacion velero = new Velero(capitan1, 2000.0, 500.0, 2020, 40.5, 7);

        Embarcacion yate1 = new Yate(capitan1, 2000.0, 500.0, 2020, 30.3, 5);
        Embarcacion yate2 = new Yate(capitan2, 4000.0, 600.0, 2020, 25.5, 5);

        System.out.println("Es grande?: " + ((Velero)velero).esGrande() );

        //((Velero)barco1).esGrande() ); --> casteo

        System.out.println( ((Yate)yate1).compareTo((Yate)yate2) );

        List<Capitan> capitanes = new ArrayList<Capitan>();
        capitanes.add(capitan1);
        capitanes.add(capitan2);
        capitanes.add(capitan3);

        System.out.println("-----DESORDENADO----");
        for(Capitan c : capitanes){
            System.out.println(c.getNombre());
        }

        capitanes.sort(Capitan::compareTo);
        System.out.println("----ORDENADO----");
        for(Capitan c : capitanes){
            System.out.println(c.getNombre());
        }
    }


}
