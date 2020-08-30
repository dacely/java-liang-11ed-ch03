package com.listings;

import java.util.Scanner;

public class L06_TestBooleanOperators
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0)
            System.out.printf("%d is divisible by 2 and 3.\n", number);

        if (number % 2 == 0 || number % 3 == 0)
            System.out.printf("%d is divisible by 2 or 3.\n", number);

        if (number % 2 == 0 ^ number % 3 == 0)
            System.out.printf("%d is divisible by 2 or 3, but not both.\n", number);
    }
}
