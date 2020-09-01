package com.exercises;

import java.util.Scanner;

public class E14_HeadsOrTails
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your guess (0 or 1): ");
        int guess = input.nextInt();
        int randBin = (int) (Math.random() * 2);
        System.out.printf("%s", guess == randBin ? "Win" : "Lose");
    }
}
