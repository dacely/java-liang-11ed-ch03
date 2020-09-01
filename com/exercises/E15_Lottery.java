package com.exercises;

import java.util.Scanner;

public class E15_Lottery
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer less than 1000: ");
        int guess = input.nextInt();
        int lottery = (int) (Math.random() * 1000);
        System.out.printf("Lottery result %03d \n", lottery);

        if (guess == lottery)
            System.out.println("You won $12.000");
        else
        {
            int t1 = lottery % 10;
            int t2 = (lottery / 10) % 10;
            int t3 = (lottery / 100) % 10;

            // All permutations of lottery result
            int p1 = (t1 + t3 * 10 + t2 * 100);
            int p2 = (t2 + t1 * 10 + t3 * 100);
            int p3 = (t2 + t3 * 10 + t1 * 100);
            int p4 = (t3 + t1 * 10 + t2 * 100);
            int p5 = (t3 + t2 * 10 + t1 * 100);

            if (guess == p1 || guess == p2 || guess == p3 || guess == p4 || guess == p5)
                System.out.println("You won $5.000");
            else
            {
                int g1 = guess % 10;
                int g2 = (guess / 10) % 10;
                int g3 = (guess / 100) % 10;

                if (g1 == t1 || g1 == t2 || g1 == t3
                    || g2 == t1 || g2 == t2 || g2 == t3
                    || g3 == t1 || g3 == t2 || g3 == t3)
                    System.out.println("You won $2.000");
                else
                    System.out.println("You lose");
            }
        }
    }
}
