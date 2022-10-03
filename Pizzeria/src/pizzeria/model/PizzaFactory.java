package pizzeria.model;

import pizzeria.exception.PizzaFactoryException;

public class PizzaFactory {
    private static PizzaFactory instance;

    public static final String COD_MUZZARELLA = "Muzzarella";
    public static final String COD_ESPECIAL = "Especial";
    public static final String COD_ANANA = "Anana";
    public static final String COD_MUZZA_GRANDE = "Muzza Grande";
    public static final String COD_ESPECIAL_GRANDE = "Especial Grande";
    public static final String COD_ANANA_GRANDE = "Anana Grande";
    public static final String COD_COMBINADA_LOCA = "Gula";



    public static PizzaFactory getInstance(){
        if (instance == null)
            instance =  new PizzaFactory();
        return instance;
    }

    public Pizza crearPizza(String codigo) throws PizzaFactoryException {
        switch (codigo){
            case COD_MUZZARELLA:
                return new PizzaSimple("Muzzarella","mucho queso", 700.0, false);
            case COD_ESPECIAL:
                return new PizzaSimple("Especial", "jamon,queso, huevo y morron",850.0,false);
            case COD_ANANA:
                return new PizzaSimple("anana", "queso y anana", 950.0, false);
            case COD_MUZZA_GRANDE:
                return new PizzaSimple("Muzzarella","mucho queso", 700.0, true);
            case COD_ESPECIAL_GRANDE:
                return new PizzaSimple("Especial", "jamon,queso, huevo y morron",850.0,true);
            case COD_ANANA_GRANDE:
                return new PizzaSimple("anana", "queso y anana", 950.0, true);
            case COD_COMBINADA_LOCA:
                PizzaCombinada combinacion1 = new PizzaCombinada("Combinada Loca", "mitad anana y mitad especial");
                combinacion1.agregrarPizza(crearPizza(COD_ANANA));
                combinacion1.agregrarPizza(crearPizza(COD_ESPECIAL));
                return combinacion1;
            default: throw new PizzaFactoryException( codigo + " es un codigo invalido");

        }

    }
}
