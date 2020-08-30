package com.checkpoints;

import java.util.Scanner;

public class Checkpoint_13_5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        int yearReminder = year % 12;

        if (yearReminder == 0)
            System.out.println("monkey");
        else if (yearReminder == 1)
            System.out.println("rooster");
        else if (yearReminder == 2)
            System.out.println("dog");
        else if (yearReminder == 3)
            System.out.println("pig");
        else if (yearReminder == 4)
            System.out.println("rat");
        else if (yearReminder == 5)
            System.out.println("ox");
        else if (yearReminder == 6)
            System.out.println("tiger");
        else if (yearReminder == 7)
            System.out.println("rabbit");
        else if (yearReminder == 8)
            System.out.println("dragon");
        else if (yearReminder == 9)
            System.out.println("snake");
        else if (yearReminder == 10)
            System.out.println("horse");
        else if (yearReminder == 11)
            System.out.println("sheep");
    }
}
