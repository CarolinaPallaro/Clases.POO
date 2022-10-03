package Class;

public class Nave extends Objet{
    private Double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, Double velocidad, int vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }


    public void girar(char direccion){
        this.direccion=direccion;
    }


    public void resta(int valor) {
        this.vida -= valor ;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
