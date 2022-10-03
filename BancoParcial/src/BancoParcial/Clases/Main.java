package BancoParcial.Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Flor", "Ojeda", 36723732, 20);
        Persona persona2 = new Persona("Romi", "Martin", 40723732, 21);
        Persona persona3 = new Persona("Joel", "Arias", 39723732, 24);


        Persona persona4 = new Persona("Franco", "Terra", 36723732, 20);
        Persona persona5 = new Persona("Tomas", "avc", 40723732, 21);
        Persona persona6 = new Persona("Grego", "Santo", 39723732, 24);


        LocalDate hoy = LocalDate.now();

        Contrato contrato1 = new ContratoPorHora(persona1, 3, true, hoy, 120, 10.5);
        Contrato contrato2 = new ContratoPorHora(persona2, 4, false, hoy, 120, 10.5);
        Contrato contrato3 = new ContratoPorHora(persona3, 5, false, hoy, 300, 5.5);

        Contrato contratoM1 = new ContratoMensual(persona4, 5, false, hoy, 500.0, 6.9, "Empleado");
        Contrato contratoM2 = new ContratoMensual(persona5, 7, true, hoy, 600.0, 7.9, "Supervisor");
        Contrato contratoM3 = new ContratoMensual(persona6, 10, true, hoy, 900.0, 400.9, "jefe");


        List<ContratoMensual> jefe = new ArrayList<ContratoMensual>();
            jefe.add((ContratoMensual)contratoM3 );
            jefe.add((ContratoMensual)contratoM1 );
            jefe.add((ContratoMensual)contratoM2 );

        int contador = 0;

        for(ContratoMensual c : jefe){
            if(c.getCargo().equals("jefe")){
                contador++;
            }
        }



        System.out.println(((ContratoMensual) contratoM3).getCargo());


        System.out.println("La cantidad de jefes existentes es: " + contador);



    }


}
