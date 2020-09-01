package com.exercises;

import java.util.Scanner;

public class E11_DaysInAMonth
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year and month (e.g, 2012 2): ");
        int year = input.nextInt();
        int monthNumber = input.nextInt();
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        switch (monthNumber)
        {
            case 1:
                System.out.printf("January %d has 31 days", year);
                break;
            case 2:
                System.out.printf("February %d has %d days", year, isLeapYear ? 29 : 28);
                break;
            case 3:
                System.out.printf("March %d has 31 days", year);
                break;
            case 4:
                System.out.printf("April %d has 30 days", year);
                break;
            case 5:
                System.out.printf("May %d has 31 days", year);
                break;
            case 6:
                System.out.printf("June %d has 30 days", year);
                break;
            case 7:
                System.out.printf("July %d has 31 days", year);
                break;
            case 8:
                System.out.printf("August %d has 31 days", year);
                break;
            case 9:
                System.out.printf("September %d has 30 days", year);
                break;
            case 10:
                System.out.printf("October %d has 31 days", year);
                break;
            case 11:
                System.out.printf("November %d has 30 days", year);
                break;
            case 12:
                System.out.printf("December %d has 31 days", year);
                break;
        }
    }
}
