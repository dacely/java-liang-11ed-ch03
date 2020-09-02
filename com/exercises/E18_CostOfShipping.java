package com.exercises;

import java.util.Scanner;

public class E18_CostOfShipping
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        double weight = input.nextDouble();

        if (weight > 0 && weight <= 2)
            System.out.printf("Shipping cost: %.1f", 2.5);
        else if (weight > 2 && weight <= 4)
            System.out.printf("Shipping cost: %.1f", 4.5);
        else if (weight > 4 && weight <= 10)
            System.out.printf("Shipping cost: %.1f", 7.5);
        else if (weight > 10 && weight <= 20)
            System.out.printf("Shipping cost: %.1f", 10.5);
        else
            System.out.println("The package cannot be shipped");
    }
}
