package com.exercises;

import java.util.Scanner;

public class E28_TwoRectangles
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first rectangle center: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter first rectangle width: ");
        double width1 = input.nextDouble();
        System.out.print("Enter first rectangle height: ");
        double height1 = input.nextDouble();

        System.out.print("Enter second rectangle center: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter second rectangle width: ");
        double width2 = input.nextDouble();
        System.out.print("Enter second rectangle height: ");
        double height2 = input.nextDouble();

        double horizontalDist = Math.abs(x2 - x1); // Horizontal distance between centers
        double verticalDist = Math.abs(y2 - y1); // Vertical distance between centers

        if (horizontalDist < (width2 - width1) / 2 && verticalDist < (height2 - height1) / 2)
            System.out.println("The first rectangle is inside the second rectangle");
        else if (horizontalDist < (width1 - width2) / 2 && verticalDist < (height1 - height2) / 2)
            System.out.println("The second rectangle is inside the first rectangle");
        else if (horizontalDist <= (width1 + width2) / 2 || verticalDist <= (height1 + height2) / 2)
            System.out.println("The rectangles overlap");
        else
            System.out.println("The rectangles do not overlap");
    }
}
