package Model;

import java.util.Scanner;

public class Elementos {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String[][] Elementos = new String[4][4];

        System.out.println("Ingresar 16 nombres de elementos quimicos");
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.println("Elementos["+i+"]["+j+"]: ");
                Elementos[i][j]=Scanner.nextLine();

            }
        }
        System.out.println("\nElementos con índices de fila y columna pares:");
        for (int i = 1; i < 4; i += 2) {
            for (int j = 1; j < 4; j += 2) {
                System.out.print(Elementos[i][j] + "\t");
            }
            System.out.println();
        }

        Scanner.close();


    }
}
