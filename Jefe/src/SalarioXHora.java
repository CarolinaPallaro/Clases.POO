public class SalarioXHora extends Contrato implements Comparable{
    //Atributos
    private Integer horasContratadas;
    private Double valorHora;

    //Constructor


    public SalarioXHora(Persona persona, Integer duracion, String fechaInicioAct, Boolean selladoMinisterio, Integer horasContratadas, Double valorHora) {
        super(persona, duracion, fechaInicioAct, selladoMinisterio);
        this.horasContratadas = horasContratadas;
        this.valorHora = valorHora;
    }

    @Override
    public int compareTo(Object o) {
        SalarioXHora xHora = (SalarioXHora) o;
        if (this.horasContratadas > xHora.horasContratadas){
            return 1;
        } else if (this.horasContratadas < xHora.horasContratadas){
                return -1;
            }
            return 0;
        }
}






