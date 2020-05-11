package com.listings;

import java.util.Scanner;

public class L01_AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) ((System.currentTimeMillis() / 10) % 10);

        System.out.printf("What is %d + %d? ", number1, number2);
        int answer = input.nextInt();
        boolean grade = (answer == number1 + number2);
        System.out.printf("%d + %d = %d is %b", number1, number2, answer, grade);
    }
}
