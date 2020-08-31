package com.exercises;

import java.util.Scanner;

public class E07_ComputeChange
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount of money, for example 11.56: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);
        int numberOfDollars = remainingAmount / 100;
        remainingAmount %= 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        System.out.printf("Your amount %.2f consist of: \n", amount);

        if (numberOfDollars > 0)
            if (numberOfDollars == 1)
                System.out.printf("\t 1 dollar \n");
            else
                System.out.printf("\t %d dollars \n", numberOfDollars);

        if (numberOfQuarters > 0)
            if (numberOfQuarters == 1)
                System.out.printf("\t 1 quarter \n");
            else
                System.out.printf("\t %d quarters \n", numberOfQuarters);

        if (numberOfDimes > 0)
            if (numberOfDimes == 1)
                System.out.printf("\t 1 dime \n");
            else
                System.out.printf("\t %d dimes \n", numberOfDimes);

        if (numberOfNickels > 0)
            if (numberOfNickels == 1)
                System.out.printf("\t 1 nickel \n");
            else
                System.out.printf("\t %d nickels \n", numberOfNickels);

        if (remainingAmount > 0)
            if (remainingAmount == 1)
                System.out.printf("\t 1 penny \n");
            else
                System.out.printf("\t %d pennies \n", remainingAmount);
    }
}
