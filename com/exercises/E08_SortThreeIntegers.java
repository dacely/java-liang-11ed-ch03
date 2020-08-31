package com.exercises;

import java.util.Scanner;

public class E08_SortThreeIntegers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese tres numeros enteros: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int temp;

        if (b > c)
        {
            temp = b;
            b = c;
            c = temp;
        }

        if (a > b)
        {
            temp = a;
            a = b;
            b = temp;

            if (b > c)
            {
                temp = b;
                b = c;
                c = temp;
            }
        }

        System.out.printf("Numeros ordenados: %d %d %d \n", a, b, c);
    }
}
