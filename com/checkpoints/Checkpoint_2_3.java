package com.checkpoints;

public class Checkpoint_2_3 {
    public static void main(String[] args) {
        boolean b = true;
        // int i = (int) b; error
        int i = b ? 1 : 0;

        i = 1;
        // b = (boolean) i; error
        b = i != 0;
    }
}
