package com.exercises;

import java.util.Scanner;

public class E34_PointInASegment
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
        if (z == 0)
        {
            if (x0 < x1)
            {
                if (x2 >= x0 && x2 <= x1)
                {
                    System.out.printf("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",
                            x2, y2, x0, y0, x1, y1);
                }
                else
                {
                    System.out.printf("(%.1f, %.1f) is NOT on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",
                            x2, y2, x0, y0, x1, y1);
                }
            }
            else
            {
                if (x2 >= x1 && x2 <= x0)
                {
                    System.out.printf("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",
                            x2, y2, x1, y1, x0, y0);
                }
                else
                {
                    System.out.printf("(%.1f, %.1f) is NOT on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",
                            x2, y2, x1, y1, x0, y0);
                }
            }
        }
        else
        {
            System.out.printf("(%.1f, %.1f) is NOT on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",
                    x2, y2, x0, y0, x1, y1);
        }
    }
}
