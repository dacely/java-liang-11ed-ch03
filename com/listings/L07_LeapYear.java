package com.listings;

import java.util.Scanner;

public class L07_LeapYear
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int y = input.nextInt();
        boolean isLeapYear = ((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0);

        if (isLeapYear)
            System.out.printf("%d is a leap year", y);
        else
            System.out.printf("%d is NOT a leap year", y);

    }
}
