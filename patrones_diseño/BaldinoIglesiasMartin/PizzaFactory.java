import java.util.Scanner;

public class PizzaFactory {

    private static PizzaFactory instance = null;
    public static final String PIZZASIMPLE ="simple";
    public static final String PIZZACOMBINADA ="combinada";

    public PizzaFactory() {
    }

    public static PizzaFactory getInstance() {
        if(instance== null)
        {
            instance = new PizzaFactory();

        }
        return instance;
    }
    public Pizza crearPizza(String x){
        switch (x){
            case "simple" :

                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese el nombre de la pizza");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese la descripcion de la pizza");
                String descripcion = scanner.nextLine();
                System.out.println("Ingrese el precio Base de la pizza");
                Double precio = scanner.nextDouble();
                System.out.println("Ingrese tamaño de la pizza : True = grande o False = chica");
                Boolean tamaño = scanner.nextBoolean();


                return new PizzaSimple(nombre,descripcion,precio,tamaño);


            case "combinada":
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Ingrese el nombre de la pizza");
                String nombre1 = scanner1.nextLine();
                System.out.println("Ingrese la descripcion de la pizza");
                String descripcion1 = scanner1.nextLine();



                return new PizzaCombinada(nombre1,descripcion1);

        }

        return null;
    }
}
