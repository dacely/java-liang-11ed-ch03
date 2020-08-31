package com.exercises;

import java.util.Scanner;

public class E06_BMI
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        double weightInKilograms = weightInPounds * 0.45359237;

        System.out.print("Enter height in feet and inches (eg. 5 7): ");
        double feet = input.nextDouble();
        double inches = input.nextDouble();
        double heightInMeters = feet * 0.3048 + inches * 0.0254;


        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);
        System.out.printf("Your BMI is %.2f which means that yor are ", bmi);

        if (bmi < 18.5)
            System.out.println("UNDERWEIGHT");
        else if (bmi < 25.0)
            System.out.println("NORMAL");
        else if (bmi < 30.0)
            System.out.println("OVERWEIGHT");
        else
            System.out.println("OBESE");
    }
}
