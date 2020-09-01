package com.exercises;

public class E16_RandomPoint
{
    public static void main(String[] args)
    {
        int x = (int) (Math.random() * 51) - 25;
        int y = (int) (Math.random() * 151) - 75;
        System.out.printf("(%d, %d)", x, y);
    }
}
