package semana9.C25_mesa.model;

public class Oferente implements Oferente_Observador{
    private String nombre;
    private String apellido;
    private Integer dni;
    private Double montoTope;

    public Oferente(String nombre, String apellido, Integer dni, Double montoTope) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.montoTope = montoTope;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getMontoTope() {
        return montoTope;
    }

    @Override
    public void accionar(Double monto) {
        if (monto < this.montoTope){
            System.out.println(this.getNombre() + " quiero comprar todo, ofrezco " + this.getMontoTope());
        }
    }
}
