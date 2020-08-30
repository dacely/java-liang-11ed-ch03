package com.listings;

import java.util.Scanner;

public class L05_ComputeTax_Single
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your filing status: ");
        System.out.println("\t 1) Single");
        System.out.println("\t 2) Married Filing Jointly");
        System.out.println("\t 3) Qualifying Widow(er)");
        System.out.println("\t 4) Married Filing Separately");
        System.out.println("\t 5) Head of Household");
        int filingStatus = input.nextInt();

        System.out.print("Enter your taxable income: ");
        double taxableIncome = input.nextDouble();
        double tax = 0;

        if (filingStatus == 1)
        {
            if (taxableIncome < 8350)
                tax = taxableIncome * 0.1;
            else if (taxableIncome < 33950)
            {
                tax = 8350 * 0.1;
                tax += (taxableIncome - 8350) * 0.15;
            }
            else if (taxableIncome < 82250)
            {
                tax = 8350 * 0.1;
                tax += (33950 - 8350) * 0.15;
                tax += (taxableIncome - 33950) * 0.25;
            }
            else if (taxableIncome < 171550)
            {
                tax = 8350 * 0.1;
                tax += (33950 - 8350) * 0.15;
                tax += (82250 - 33950) * 0.25;
                tax += (taxableIncome - 82250) * 0.28;
            }
            else if (taxableIncome < 372950)
            {
                tax = 8350 * 0.1;
                tax += (33950 - 8350) * 0.15;
                tax += (82250 - 33950) * 0.25;
                tax += (171550 - 82250) * 0.28;
                tax += (taxableIncome - 171550) * 0.33;
            }
            else
            {
                tax = 8350 * 0.1;
                tax += (33950 - 8350) * 0.15;
                tax += (82250 - 33950) * 0.25;
                tax += (171550 - 82250) * 0.28;
                tax += (372950 - 171550) * 0.33;
                tax += (taxableIncome - 372950) * 0.35;
            }
        }
        else
        {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        System.out.printf("Your total tax is: %.2f", tax);
    }
}
