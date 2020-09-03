package com.exercises;

import java.util.Scanner;

public class E32_PointLinePosition
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 0 (x0 y0): ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        System.out.print("Enter point 1 (x1 y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point 2 (x2 y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double z = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if (z > 0)
        {
            System.out.println("p2 is on the left side of the line");
        }
        else if (z == 0)
        {
            System.out.println("p2 is on the same line");
        }
        else
        {
            System.out.println("p2 is on the right side of the line");
        }
    }
}
