package Model;

import java.util.Scanner;

public class RegistroDePartidos {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Ganados,Empatados,Perdidos,Puntos;

        System.out.println("Ingresar el numero de partidos ganados");
        Ganados = entrada.nextInt();

        System.out.println("Ingresar el numero de partidos empatados");
        Empatados = entrada.nextInt();

        System.out.println("Ingresar el numero de partidos perdidos");
        Perdidos = entrada.nextInt();

        Puntos = (Ganados*3)+(Empatados*1)+(Perdidos*0);

        System.out.println(" ");
        System.out.println("Total de puntos obtenidos en el torneo:"+ Puntos);



    }
}
