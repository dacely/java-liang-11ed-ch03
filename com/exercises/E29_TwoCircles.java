package com.exercises;

import java.util.Scanner;

public class E29_TwoCircles
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter center circle 1 (x1 y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter radius circle 1: ");
        double r1 = input.nextDouble();

        System.out.print("Enter center circle 2 (x2 y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter radius circle 2: ");
        double r2 = input.nextDouble();

        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double R = Math.max(r2, r1);
        double r = Math.min(r2, r1);

        if (d <= R - r)
        {
            if (r2 == R)
                System.out.println("Circle 1 is inside circle 2");
            else
                System.out.println("Circle 2 is inside circle 1");
        }
        else if (d <= R + r)
        {
            if (r2 == R)
                System.out.println("Circle 1 overlaps circle 2");
            else
                System.out.println("Circle 2 overlaps circle 1");
        }
        else
        {
            if (r2 == R)
                System.out.println("Circle 1 is outside circle 2");
            else
                System.out.println("Circle 2 is outside circle 1");
        }
    }
}
