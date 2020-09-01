package com.exercises;

import java.util.Scanner;

public class E09_CheckISBN
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();
        int isbnCopy = isbn;
        int sum = 0;

        sum += (isbn % 10) * 9;
        isbn /= 10;
        sum += (isbn % 10) * 8;
        isbn /= 10;
        sum += (isbn % 10) * 7;
        isbn /= 10;
        sum += (isbn % 10) * 6;
        isbn /= 10;
        sum += (isbn % 10) * 5;
        isbn /= 10;
        sum += (isbn % 10) * 4;
        isbn /= 10;
        sum += (isbn % 10) * 3;
        isbn /= 10;
        sum += (isbn % 10) * 2;
        isbn /= 10;
        sum += (isbn % 10) * 1;

        if (sum % 11 == 10)
            System.out.printf("The ISBN-10 number is %09d%s", isbnCopy, "X");
        else
            System.out.printf("The ISBN-10 number is %09d%d", isbnCopy, sum % 11);
    }
}
