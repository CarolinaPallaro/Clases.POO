import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Ejercicio 1*/
        System.out.println("Ejercicio 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        System.out.println(esPrimo(num));

        /*
        Ejercicio 2
         */
        System.out.println("Ejercicio 2");
        System.out.println("Ingrese un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese un numero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese un numero: ");
        int num3 = sc.nextInt();
        System.out.println("El maximo entre los tres numeros es: " + maximoEntreTresNumeros(num1, num2, num3));

        /*
         Ejercicio 3
         */
        System.out.println("Ejercicio 3");
        System.out.println("Ingrese un texto: ");
        String texto1 = sc.next();
        System.out.println("Ingrese un texto: ");
        String texto2 = sc.next();
        System.out.println(cadenasDeTextoDistintas(texto1, texto2));


    }

    /*Ejercicio 1*/
    public static String esPrimo(int num) {
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            return "El numero es primo";
        } else {
            return "El numero no es primo";
        }
    }

    /*Ejercicio 2*/
    public static int maximoEntreTresNumeros(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
    /*Ejercicio 3*/
    public static boolean cadenasDeTextoDistintas(String texto1, String texto2) {
        if (texto1.equals(texto2)) {
            return false;
        } else {
            return true;
        }
    }


}
