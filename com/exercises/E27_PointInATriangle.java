package com.exercises;

import java.util.Scanner;

public class E27_PointInATriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (x >= 0 && y >= 0)
        {
            double yLine = 100 - (x / 2);

            if (y <= yLine)
                System.out.println("The point is in the triangle");
            else
                System.out.println("The point is not in the triangle");
        }
        else
            System.out.println("The point is not in the triangle");
    }
}
