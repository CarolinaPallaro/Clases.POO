package BarcosDH.modelos;

public class Capitan implements Comparable<Capitan>{
    private  String nombre;
    private String apellido;
    private  Integer matricula;

    public Capitan(String nombre, String apellido, Integer matricula){
    this.nombre=nombre;
    this.apellido=apellido;
    this.matricula=matricula;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Capitan otroCapitan) {
        return nombre.compareTo(otroCapitan.nombre);
    }
}
