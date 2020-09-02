package com.exercises;

import java.util.Scanner;

public class E20_WindChillTemperature
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double t_a = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double v = input.nextDouble();

        if (t_a < -58 || t_a > 41 || v < 2)
        {
            System.out.println("Invalid Input");
            System.exit(1);
        }
        else
        {
            double t_wc = 35.74 + 0.6215 * t_a - 35.75 * Math.pow(v, 0.16) + 0.4275 * t_a * Math.pow(v, 0.16);
            System.out.printf("The wind chill index is %.2f", t_wc);
        }

    }
}
