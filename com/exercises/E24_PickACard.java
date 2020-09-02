package com.exercises;

import java.util.Scanner;

public class E24_PickACard
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a rank (1-13)");
        System.out.print("\t  1) Ace \n");
        System.out.print("\t  2) Two \n");
        System.out.print("\t  3) Three \n");
        System.out.print("\t  4) Four \n");
        System.out.print("\t  5) Five \n");
        System.out.print("\t  6) Six \n");
        System.out.print("\t  7) Seven \n");
        System.out.print("\t  8) Eight \n");
        System.out.print("\t  9) Nine \n");
        System.out.print("\t 10) Ten \n");
        System.out.print("\t 11) Jack \n");
        System.out.print("\t 12) Queen \n");
        System.out.print("\t 13) King \n");
        int rank = input.nextInt();

        System.out.println("Pick a suit(1-4): ");
        System.out.print("\t 1) Clubs \n");
        System.out.print("\t 2) Diamonds \n");
        System.out.print("\t 3) Hearts \n");
        System.out.print("\t 4) Spades \n");
        int suit = input.nextInt();

        System.out.print("The card you picked is ");
        switch (rank)
        {
            case 1:
                System.out.print("Ace");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
            case 10:
                System.out.print("Ten");
                break;
            case 11:
                System.out.print("Jack");
                break;
            case 12:
                System.out.print("Queen");
                break;
            case 13:
                System.out.print("King");
                break;
        }

        System.out.print(" of ");
        switch (suit)
        {
            case 1:
                System.out.print("Clubs");
                break;
            case 2:
                System.out.print("Diamonds");
                break;
            case 3:
                System.out.print("Hearts");
                break;
            case 4:
                System.out.print("Spades");
                break;
        }
    }
}
