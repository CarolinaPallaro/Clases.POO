package models;

import exceptions.CursosException;

public class CursosFactory {
    public static CursosFactory instance;
    public static final String JS = "JavaScript";
    public static final String BD = "Bases de datos";
    public static final String JAVA = "Java";

    private CursosFactory() {}

    public Curso CrearCurso(String tipo) throws CursosException {
        switch (tipo) {
            case JS:
                return new Curso(JS, "el js", 20, 100.0, 5);
            case BD:
                return new Curso(BD, "el diegote", 10, 100.0, 4);
            case JAVA:
                return new Curso(JAVA, "el otro diegote", 4, 50.0, 1);
            default:
                throw new CursosException("No existe el curso");
        }
    }

    public static CursosFactory getInstance() {
        if (instance == null)
            instance = new CursosFactory();

        return instance;
    }
}
