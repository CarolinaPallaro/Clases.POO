package com.PelotasDH.factory.model;

public class ProductoFacktory {

    //Atributo static que se puede llamar sin crear una nueva instancia
    //Como no quiero que nadie modifique mi codigo declaro instance en privado.
    private static ProductoFacktory instance;

    //Constructor privado de mismo nopmbre, se declara sin cuerpo

    public static final String CAJA10X10 = "c10x10";
    public static final String PELOTAFUTBOL = "PELOTAFUTBOL";
    public static final String PELOTATENIS = "PELOTATENIA";

    private ProductoFacktory(){}


    //Get instance produce un onjeto del mismo tipo
    public static ProductoFacktory getInstance(){
        if(instance == null)
            instance = new ProductoFacktory();
          return instance;
    }

   //---------------HASTA AQUI ARRIBA SINGLETON-----------------


//METODO PUBLI DE INSTANCIAS DE PRODUCT FACTORY
   public Producto crearProducto(String codigo) throws ProductoFactoryException {
        switch (codigo){
            case "CAJA10X10":
                return new Caja(0.1, 10.0,10.0,10.0);

            case "PELOTAFUTBOL":
                    return new Pelota(0.43, 11.0);

            case "PELOTENIS":
                return new Pelota(0.06, 3.2);

            default:
                throw new ProductoFactoryException("Codigo" + codigo + "Es ivalido");
            }
        }

   }

