package Almacen2.models;

public class Pizza extends Producto{

    private String sabor;
    private String tamanio;


    public Pizza(Double precio, String nombre, String tamanio, String sabor) {
        super(precio, nombre);
        this.tamanio = tamanio;

        this.sabor = sabor;
    }

    public void calcularComensales(){
        if(tamanio.equalsIgnoreCase("Grande")){
            System.out.println("Con esta pizza tamanio "+ tamanio +" Comen hasta 3 personas");
        }else System.out.println("Con esta pizza tamanio "+ tamanio + " come una persona");
    }

}
