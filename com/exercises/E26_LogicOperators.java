package com.exercises;

import java.util.Scanner;

public class E26_LogicOperators
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        System.out.printf("Is %d divisible by 4 and 5? %b \n", num,
                num % 4 == 0 && num % 5 == 0);
        System.out.printf("Is %d divisible by 4 or 5? %b \n", num,
                num % 4 == 0 || num % 5 == 0);
        System.out.printf("Is %d divisible by 4 or 5 but not both? %b \n", num,
                num % 4 == 0 ^ num % 5 == 0);
    }
}
