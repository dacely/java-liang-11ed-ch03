package com.exercises;

import java.util.Scanner;

public class E31_ExchangeRate
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars US dollars to Colombian Pesos: ");
        double exRate = input.nextDouble();
        System.out.println("\t 0) US Dollars to Colombian Pesos");
        System.out.println("\t 1) Colombian Pesos to US Dollars");
        byte exDir = input.nextByte();
        double dollarAmount = 0;
        double pesosAmount = 0;

        switch (exDir)
        {
            case 0:
                System.out.print("Enter dollar amount: ");
                dollarAmount = input.nextDouble();
                pesosAmount = dollarAmount * exRate;
                System.out.printf("%.2f dollars are %.2f pesos", dollarAmount, pesosAmount);
                break;
            case 1:
                System.out.print("Enter pesos amount: ");
                pesosAmount = input.nextDouble();
                dollarAmount = pesosAmount / exRate;
                System.out.printf("%.2f pesos are %.2f dollars", pesosAmount, dollarAmount);
                break;
            default:
                System.out.println("Invalid Input");
                System.exit(1);
        }
    }
}
