public class Contrato {
    private Persona persona;
    private Integer duracion;
    private String fechaInicioAct;
    private Boolean selladoMinisterio;

    // Constructor

    public Contrato(Persona persona, Integer duracion, String fechaInicioAct, Boolean selladoMinisterio) {
        this.persona = persona;
        this.duracion = duracion;
        this.fechaInicioAct = fechaInicioAct;
        this.selladoMinisterio = selladoMinisterio;
    }

    //Metodos

    public Boolean sePuedeIncorporar(){
        if(this.selladoMinisterio == true){
            return true;
        }
    return false;
    }
}
