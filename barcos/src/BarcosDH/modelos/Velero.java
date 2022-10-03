package BarcosDH.modelos;

public class Velero extends Embarcacion{
    private  Integer mastiles;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer mastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.mastiles=mastiles;
    }

    public Boolean esGrande(){
        return mastiles > 4;
    }

    @Override
    public Double actualizarValor(Integer anio) {
        return anio;
    }

    @Override
    public Double actualizarprecioBase(Integer anio){
        return getPrecioBase() - 500.0*(anio-getAnioFabricacion());
    }


}
