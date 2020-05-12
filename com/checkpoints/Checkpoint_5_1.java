package com.checkpoints;

import java.util.Scanner;

public class Checkpoint_5_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = input.nextInt();
        System.out.print("Enter the value of y: ");
        int y = input.nextInt();

        if (x > 2)
        {
            if (y > 2)
            {
                int z = x + y;
                System.out.println("z is " + z);
            }
        }
        else
        {
            System.out.println("x is " + x);
        }
    }
}
