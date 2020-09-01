package com.exercises;

import java.util.Scanner;

public class E17_ScissorRockPaper
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Scissor(0), Rock(1), Paper(2): ");
        int user = input.nextInt();
        int computer = (int) (Math.random() * 3);

        switch (user)
        {
            case 0:
                switch (computer)
                {
                    case 0:
                        System.out.println("Scissor: Draw");
                        break;
                    case 1:
                        System.out.println("Rock: You lose");
                        break;
                    case 2:
                        System.out.println("Paper: You won");
                        break;
                }
                break;
            case 1:
                switch (computer)
                {
                    case 0:
                        System.out.println("Scissor: You won");
                        break;
                    case 1:
                        System.out.println("Rock: Draw");
                        break;
                    case 2:
                        System.out.println("Paper: You lose");
                        break;
                }
                break;
            case 2:
                switch (computer)
                {
                    case 0:
                        System.out.println("Scissor: You lose");
                        break;
                    case 1:
                        System.out.println("Rock: You won");
                        break;
                    case 2:
                        System.out.println("Paper: Draw");
                        break;
                }
        }
    }
}
