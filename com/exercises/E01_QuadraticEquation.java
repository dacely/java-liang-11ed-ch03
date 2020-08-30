package com.exercises;

import java.util.Scanner;

public class E01_QuadraticEquation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double D = Math.pow(b, 2) - 4 * a * c;

        if (D < 0)
            System.out.println("The equation has no real roots");
        else if (0 == D)
        {
            double root = -b / (2 * a);
            System.out.printf("The equation has one root: %.2f", root);
        }
        else if (D > 0)
        {
            double r1 = (-b + Math.sqrt(D)) / (2 * a);
            double r2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("The equation has two roots: %.2f and %.2f", r1, r2);
        }
    }
}
