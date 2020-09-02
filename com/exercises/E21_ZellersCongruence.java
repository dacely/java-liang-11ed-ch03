package com.exercises;

import java.util.Scanner;

public class E21_ZellersCongruence
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year (e.g., 2012): ");
        int y = input.nextInt();
        System.out.print("Enter month (1 - 12): ");
        int m = input.nextInt();
        System.out.print("Enter the day of the month (1 - 31): ");
        int d = input.nextInt();

        switch (m)
        {
            case 1:
            case 2:
                y -= 1;
                m += 12;
                break;
        }
        int j = y / 100;
        int k = y % 100;

        int h = (d + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        System.out.print("The day of the week is ");
        switch (h)
        {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
        }
    }
}
