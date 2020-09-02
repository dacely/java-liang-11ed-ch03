package com.exercises;

import java.util.Scanner;

public class E22_PointInACircle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (d <= 10)
            System.out.printf("Point (%.2f, %.2f) is in the circle.", x, y);
        else
            System.out.printf("Point (%.2f, %.2f) is not in the circle.", x, y);
    }
}
