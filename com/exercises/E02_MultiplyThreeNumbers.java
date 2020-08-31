package com.exercises;

import java.util.Scanner;

public class E02_MultiplyThreeNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n1 = 2 + (int) (Math.random() * 8);
        int n2 = 2 + (int) (Math.random() * 8);
        int n3 = 2 + (int) (Math.random() * 8);

        System.out.printf("Cuanto es %d x %d x %d? ", n1, n2, n3);
        int ans = input.nextInt();
        if (ans == n1 * n2 * n3)
            System.out.println("Correcto");
        else
            System.out.println("Incorrecto");
    }
}
