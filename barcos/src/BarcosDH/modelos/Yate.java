package BarcosDH.modelos;

public class Yate extends Embarcacion implements Comparable<Yate>, Bocineable{
    private Integer camarotes;


    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer camarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.camarotes=camarotes;
    }

    @Override
    public  int compareTo(Yate otroYate){
        return camarotes.compareTo(otroYate.camarotes);
    }


    @Override
    public Double actualizarValor(Integer anio) {
        Double nuevoPrecio = getPrecioBase() - 1000.0*(anio-getAnioFabricacion());
        setPrecioBase(nuevoPrecio);
        return nuevoPrecio;
    }

    @Override
    public void tocarBocina() {
        System.out.println("piiii PIIIIIIIIIIII");
    }
}
