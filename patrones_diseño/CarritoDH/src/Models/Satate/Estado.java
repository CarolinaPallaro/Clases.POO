package Models.Satate;

public interface Estado {

    void agregar(Producto productos);

    void cancelar();
    void volver();
    void siguiente();
}
