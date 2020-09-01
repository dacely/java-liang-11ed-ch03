package com.exercises;

import java.util.Scanner;

public class E13_ComputeTax
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

        switch (filingStatus)
        {
            case 1:
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
                break;
            case 2:
            case 3:
                if (taxableIncome < 16700)
                    tax = taxableIncome * 0.1;
                else if (taxableIncome < 67900)
                {
                    tax = 16700 * 0.1;
                    tax += (taxableIncome - 16700) * 0.15;
                }
                else if (taxableIncome < 137050)
                {
                    tax = 16700 * 0.1;
                    tax += (67900 - 16700) * 0.15;
                    tax += (taxableIncome - 67900) * 0.25;
                }
                else if (taxableIncome < 208850)
                {
                    tax = 16700 * 0.1;
                    tax += (67900 - 16700) * 0.15;
                    tax += (137050 - 67900) * 0.25;
                    tax += (taxableIncome - 137050) * 0.28;
                }
                else if (taxableIncome < 372950)
                {
                    tax = 16700 * 0.1;
                    tax += (67900 - 16700) * 0.15;
                    tax += (137050 - 67900) * 0.25;
                    tax += (208850 - 137050) * 0.28;
                    tax += (taxableIncome - 208850) * 0.33;
                }
                else
                {
                    tax = 16700 * 0.1;
                    tax += (67900 - 16700) * 0.15;
                    tax += (137050 - 67900) * 0.25;
                    tax += (208850 - 137050) * 0.28;
                    tax += (372950 - 208850) * 0.33;
                    tax += (taxableIncome - 372950) * 0.35;
                }
                break;
            case 4:
                if (taxableIncome < 8350)
                    tax = taxableIncome * 0.1;
                else if (taxableIncome < 33950)
                {
                    tax = 8350 * 0.1;
                    tax += (taxableIncome - 8350) * 0.15;
                }
                else if (taxableIncome < 68525)
                {
                    tax = 8350 * 0.1;
                    tax += (33950 - 8350) * 0.15;
                    tax += (taxableIncome - 33950) * 0.25;
                }
                else if (taxableIncome < 104425)
                {
                    tax = 8350 * 0.1;
                    tax += (33950 - 8350) * 0.15;
                    tax += (68525 - 33950) * 0.25;
                    tax += (taxableIncome - 68525) * 0.28;
                }
                else if (taxableIncome < 186475)
                {
                    tax = 8350 * 0.1;
                    tax += (33950 - 8350) * 0.15;
                    tax += (68525 - 33950) * 0.25;
                    tax += (104425 - 68525) * 0.28;
                    tax += (taxableIncome - 104425) * 0.33;
                }
                else
                {
                    tax = 8350 * 0.1;
                    tax += (33950 - 8350) * 0.15;
                    tax += (68525 - 33950) * 0.25;
                    tax += (104425 - 68525) * 0.28;
                    tax += (186475 - 104425) * 0.33;
                    tax += (taxableIncome - 186475) * 0.35;
                }
                break;
            case 5:
                if (taxableIncome < 11950)
                    tax = taxableIncome * 0.1;
                else if (taxableIncome < 45500)
                {
                    tax = 11950 * 0.1;
                    tax += (taxableIncome - 11950) * 0.15;
                }
                else if (taxableIncome < 117450)
                {
                    tax = 11950 * 0.1;
                    tax += (45500 - 11950) * 0.15;
                    tax += (taxableIncome - 45500) * 0.25;
                }
                else if (taxableIncome < 190200)
                {
                    tax = 11950 * 0.1;
                    tax += (45500 - 11950) * 0.15;
                    tax += (117450 - 45500) * 0.25;
                    tax += (taxableIncome - 117450) * 0.28;
                }
                else if (taxableIncome < 372950)
                {
                    tax = 11950 * 0.1;
                    tax += (45500 - 11950) * 0.15;
                    tax += (117450 - 45500) * 0.25;
                    tax += (190200 - 117450) * 0.28;
                    tax += (taxableIncome - 190200) * 0.33;
                }
                else
                {
                    tax = 11950 * 0.1;
                    tax += (45500 - 11950) * 0.15;
                    tax += (117450 - 45500) * 0.25;
                    tax += (190200 - 117450) * 0.28;
                    tax += (372950 - 190200) * 0.33;
                    tax += (taxableIncome - 372950) * 0.35;
                }
                break;
            default:
                System.out.println("Error: invalid status");
                System.exit(1);
        }

        System.out.printf("Your total tax is: %.2f", tax);


    }
}
