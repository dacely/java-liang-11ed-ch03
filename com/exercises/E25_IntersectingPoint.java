package com.exercises;

import java.util.Scanner;

public class E25_IntersectingPoint
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (x1 y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point 2 (x2 y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter point 3 (x3 y3): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        System.out.print("Enter point 4 (x4 y4): ");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = x2 - x1;
        double e = a * x1 + b * y1;

        double c = y3 - y4;
        double d = x4 - x3;
        double f = c * x3 + d * y3;

        double det = a*d - b*c;

        if (Math.abs(det) < 1E-14)
            System.out.println("The two lines are parallel");
        else
        {
            double x = (e*d - b*f) / det;
            double y = (a*f - e*c) / det;
            System.out.printf("The intersecting point is at (%.2f, %.2f)", x, y);
        }
    }
}
