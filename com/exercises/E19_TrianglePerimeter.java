package com.exercises;

import java.util.Scanner;

public class E19_TrianglePerimeter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of each side of a triangle");
        System.out.print("Side a: ");
        double a = input.nextDouble();
        System.out.print("Side b: ");
        double b = input.nextDouble();
        System.out.print("Side c: ");
        double c = input.nextDouble();

        if (a + b < c || a + c < b || b + c < a)
            System.out.println("Invalid input");
        else
        {
            double p = a + b + c;
            System.out.printf("Perimeter: %f", p);

        }
    }
}
