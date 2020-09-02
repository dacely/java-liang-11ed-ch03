package com.exercises;

import java.util.Scanner;

public class E03_CramersRule
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Regla de Cramer para dos ecuaciones:");
        System.out.println("\t (1) ax + by = e");
        System.out.println("\t (2) cx + dy = f");

        System.out.print("Ingrese coeficientes de la equacion (1) [a b e]: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double e = input.nextDouble();

        System.out.print("Ingrese coeficientes de la equacion (2) [c d f]: ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        double f = input.nextDouble();

        double det = a*d - b*c;

        if (Math.abs(det) < 1E-14)
            System.out.println("La equacion no tiene solucion.");
        else
        {
            double x = (e*d - b*f) / det;
            double y = (a*f - e*c)  / det;
            System.out.println("Solucion: ");
            System.out.printf("\t x = %.2f\n", x);
            System.out.printf("\t y = %.2f\n", y);
        }
    }
}
