package com.exercises;

import java.util.Scanner;

public class E10_MultiplicationQuiz
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = (int) (Math.random() * 1000);
        int b = (int) (Math.random() * 1000);

        if (a < b)
        {
            int c = a;
            a = b;
            b = c;
        }

        System.out.printf("What is %d x %d? ", a, b);
        int answer = input.nextInt();

        if (answer == a * b)
            System.out.println("Correct");
        else
            System.out.println("Incorrect");
    }
}
