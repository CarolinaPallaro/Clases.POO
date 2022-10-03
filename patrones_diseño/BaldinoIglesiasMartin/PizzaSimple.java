public class PizzaSimple extends Pizza{

    private double precioBase;
    private boolean esGrande;

    public PizzaSimple(String nombre, String descripcion, double precioBase, boolean esGrande) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.esGrande = esGrande;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean getEsGrande() {
        return esGrande;
    }

    public void setEsGrande(boolean esGrande) {
        this.esGrande = esGrande;
    }

    @Override
    public double calcularPrecio() {
        if(esGrande)
        {
            return precioBase*2;
        }else {
            return precioBase;
        }
    }
}
