package com.listings;

import java.util.Scanner;

public class L03_SubtractionQuiz
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);

        if (a < b)
        {
            int c = a;
            a = b;
            b = c;
        }

        System.out.printf("What is %d - %d? ", a, b);
        int answer = input.nextInt();

        if (answer == a - b)
            System.out.println("Correct");
        else
            System.out.println("Incorrect");
    }
}
