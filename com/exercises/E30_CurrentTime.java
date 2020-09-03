package com.exercises;

import java.util.Scanner;

public class E30_CurrentTime
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        byte offset = input.nextByte();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;

        long currentSeconds = totalSeconds % 60;
        long currentMinutes = totalMinutes % 60;
        long currentHours = (totalHours + offset) % 24;

        if (currentHours <= 11)
            System.out.printf("%02d:%02d:%02d a.m.", currentHours, currentMinutes, currentSeconds);
        else if (currentHours == 12)
            System.out.printf("%02d:%02d:%02d noon", currentHours, currentMinutes, currentSeconds);
        else
            System.out.printf("%02d:%02d:%02d p.m.", currentHours - 12, currentMinutes, currentSeconds);
    }
}
