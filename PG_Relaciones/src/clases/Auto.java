package clases;

public class Auto {
    private String patente;
    private  String marca;
    private  String modelo;
    Motor motor;


    public Auto(String patente, String marca, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
        motor = new Motor();
    }

    public String getPatente(){
        return  patente;
    }
}
