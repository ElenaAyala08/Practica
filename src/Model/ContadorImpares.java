package Model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ContadorImpares {
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero entero");
        numero = Scanner.nextInt();

        System.out.println("Numeros impares entre 0 y "+numero+":");

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i+" ");

            }

        }

    }
}
