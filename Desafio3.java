package Desafios;

import java.util.Scanner;

public class Desafio3 {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese valor: ");
        numero = input.nextInt();

        System.out.println("Los primeros " + numero + " numeros primos son: ");
        detectarNrosPrimos(numero);


    }

    public static void detectarNrosPrimos ( int valor)
    {
        int acc = 0;
        int contador = 0;
        int valores = 2;

        //contador sumara 1 por cada nro primo encontrado
        while(contador < valor)
        {
            for(int i=1; i<valores;i++)
            {
                if (valores % i == 0)
                    acc++;
            }

            if(acc==1)
            {
                contador++;
                System.out.println(valores);
            }

            valores++;
            acc = 0;
        }
    }
}
