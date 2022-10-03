public class SalarioXMes extends Contrato {

    //Atributos

    private Double salario;
    private Double horasTotales;
    private String tipoCargo;

    //Constructor


    public SalarioXMes(Persona persona, Integer duracion, String fechaInicioAct, Boolean selladoMinisterio, Double salario, Double horasTotales, String tipoCargo) {
        super(persona, duracion, fechaInicioAct, selladoMinisterio);
        this.salario = salario;
        this.horasTotales = horasTotales;
        this.tipoCargo = tipoCargo;
    }

    //Metodos

    public Boolean esJefe(){
        if (this.tipoCargo == "Jefe"){
            return true;
        }
        return false;
    }
}
