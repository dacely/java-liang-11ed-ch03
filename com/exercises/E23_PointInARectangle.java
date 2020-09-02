package com.exercises;

import java.util.Scanner;

public class E23_PointInARectangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (Math.abs(x) <= 5 && Math.abs(y) <= 2.5)
            System.out.printf("Point (%.2f, %.2f) is in the rectangle.", x, y);
        else
            System.out.printf("Point (%.2f, %.2f) is not in the rectangle.", x, y);
    }
}
