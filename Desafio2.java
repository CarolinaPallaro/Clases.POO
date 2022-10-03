package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        String player1;
        String player2;
        int respuesta1;
        int respuesta2;
        String continuar = "s";

        System.out.println("Player 1: ");
        player1 = input.next();

        System.out.println("Player 2: ");
        player2 = input.next();

        while(continuar.equals("s")) {
            System.out.println(player1 + ", elija su jugada: \n1 - Piedra \n2 - Papel \n3 - Tijera \n4 - Spock");
            respuesta1 = input.nextInt();

            System.out.println(player2 + ", elija su jugada: \n1 - Piedra \n2 - Papel \n3 - Tijera \n4 - Spock");
            respuesta2 = input.nextInt();

            analizarJugada(player1, player2, respuesta1, respuesta2);

            System.out.println("Desea volver a jugar? s/n");
            continuar = input.next();
        }

        System.out.println("Ni nos vimos!");
    }


    public static void analizarJugada (String p1, String p2, int jugada1, int jugada2){

        switch(jugada1)
        {
            case 1:
            {
                if(jugada2 == 1)
                    System.out.println("---Es un empate---");
                if(jugada2 == 2)
                    System.out.println("--- Gano "+ p2 + " ---");
                if(jugada2 == 3)
                    System.out.println("--- Gano "+ p1 + " ---");
                if(jugada2 == 4)
                    System.out.println("--- Gano "+ p2 + " ---");
                break;
            }
            case 2:
            {
                if(jugada2 == 2)
                    System.out.println("---Es un empate---");
                if(jugada2 == 1)
                    System.out.println("--- Gano "+ p1 + " ---");
                if(jugada2 == 3)
                    System.out.println("--- Gano "+ p2 + " ---");
                if(jugada2 == 4)
                    System.out.println("--- Gano "+ p1 + " ---");
                break;
            }
            case 3:
            {
                if(jugada2 == 3)
                    System.out.println("---Es un empate---");
                if(jugada2 == 1)
                    System.out.println("--- Gano "+ p2 + " ---");
                if(jugada2 == 2)
                    System.out.println("--- Gano "+ p1 + " ---");
                if(jugada2 == 4)
                    System.out.println("--- Gano "+ p2 + " ---");
                break;
            }
            case 4:
            {
                if(jugada2 == 3)
                    System.out.println("--- Gano "+ p1 + " ---");
                if(jugada2 == 1)
                    System.out.println("--- Gano "+ p1 + " ---");
                if(jugada2 == 2)
                    System.out.println("--- Gano "+ p2 + " ---");
                if(jugada2 == 4)
                    System.out.println("---Es un empate---");
                break;
            }
        }
    }
}
