package com.exercises;

import java.util.Scanner;

public class E35_EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.printf("%d is %s number", n % 2 == 0 ? "even" : "odd");
    }
}
