import exceptions.CursosException;
import models.Curso;
import models.CursosFactory;
import models.Instituto;
import models.Programa;

public class Main {
    public static void main(String[] args) {
        try {
            Instituto instituto = new Instituto();

            CursosFactory cfactory = CursosFactory.getInstance();

            Curso cursojs = cfactory.CrearCurso(CursosFactory.JS);
            Curso cursobd = cfactory.CrearCurso(CursosFactory.BD);
            Curso curso234234 = cfactory.CrearCurso("Design thinking");

            Programa programa1 = new Programa("CTD", "Una poronga de curso", 10.0);
            programa1.AddCursoOPrograma(cursobd);
            programa1.AddCursoOPrograma(cursojs);


            instituto.addCursoOPrograma(programa1);
            instituto.addCursoOPrograma(cursojs);

            instituto.generarInforme();
        }
        catch (CursosException e) {
            System.out.println(e.getMessage());
        }
    }
}