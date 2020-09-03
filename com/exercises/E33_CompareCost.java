package com.exercises;

import java.util.Scanner;

public class E33_CompareCost
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double w1 = input.nextDouble();
        double p1 = input.nextDouble();
        double r1 = p1 / w1;

        System.out.print("Enter weight and price for package 2: ");
        double w2 = input.nextDouble();
        double p2 = input.nextDouble();
        double r2 = p2 / w2;

        if (r2 < r1)
        {
            System.out.print("Package 2 has a better price.");
        }
        else if (r1 > r2)
        {
            System.out.print("Package 1 has a better price.");
        }
        else
        {
            System.out.print("Two packages have the same price.");
        }
    }
}
