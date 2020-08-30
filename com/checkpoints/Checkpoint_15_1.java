package com.checkpoints;

public class Checkpoint_15_1
{
    public static void main(String[] args)
    {
        boolean result = true || true && false; // true
        System.out.println(result);

        result = true && true || false; // true
        System.out.println(result);
    }
}
