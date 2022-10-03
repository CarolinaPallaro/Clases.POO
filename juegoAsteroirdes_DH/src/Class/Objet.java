package Class;

public class Objet {

    private int posx;
    private int posy;
    protected char direccion;


    public Objet(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void irA (int posx, int posy, char direccion){
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
        System.out.println("Me estoy miviendo hacia la posicion " + direccion);
    }


}
