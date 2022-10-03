package clases;

public class Main {
    public static void main(String[] args) {

        Chofer chofer;
        chofer = new Chofer("Juan", "Garcia", new Auto("55432", "Autazo", "2026"));

        System.out.println("La patente de este auto es: "+ chofer.verPatente());

    }
}
