package com.exercises;

import java.util.Scanner;

public class E12_ThreeDigitPalindrome
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int num = input.nextInt();
        int d1 = num % 10;
        int d3 = num / 100;
        System.out.printf("%d %s a palindrome", num, d1 == d3 ? "is" : "is not");
    }
}
