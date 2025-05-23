package Model;

import java.util.Scanner;

public class DescuentoSueldo
{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Ingrese sueldo del empleado: $");
        double Sueldo = Scanner.nextDouble();
        double Descuento = 0;

        if (Sueldo < 500) {
            Descuento = 0;
        } else if (Sueldo >= 500 && Sueldo < 750) {
            Descuento = Sueldo*0.05;
        } else {
            Descuento = Sueldo*0.10;
        }
        System.out.println("El monto a descontar es: $"+ Descuento);
        Scanner.close();
    }

}

