package clases;

public class Chofer {

    public String nombre;
    public String apellido;
    Auto auto;

    public Chofer(String nombre, String apellido, Auto auto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = auto;
    }

    public String verPatente(){
        return auto.getPatente();
    }
}
