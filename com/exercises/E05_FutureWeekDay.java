package com.exercises;

import java.util.Scanner;

public class E05_FutureWeekDay
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("¿Que numero de dia es hoy (domingo es 0)?: ");
        int currentDay = input.nextInt();
        System.out.print("Ingrese el numero de dias que deben transcurrir: ");
        int elapsedDays = input.nextInt();
        int futureDay = (currentDay + elapsedDays) % 7;

        System.out.print("Hoy es ");
        switch (currentDay)
        {
            case 0:
                System.out.print("domingo");
                break;
            case 1:
                System.out.print("lunes");
                break;
            case 2:
                System.out.print("martes");
                break;
            case 3:
                System.out.print("miercoles");
                break;
            case 4:
                System.out.print("jueves");
                break;
            case 5:
                System.out.print("viernes");
                break;
            case 6:
                System.out.print("sabado");
                break;
        }

        System.out.printf(" y en %d dias sera ", elapsedDays);
        switch (futureDay)
        {
            case 0:
                System.out.print("domingo");
                break;
            case 1:
                System.out.print("lunes");
                break;
            case 2:
                System.out.print("martes");
                break;
            case 3:
                System.out.print("miercoles");
                break;
            case 4:
                System.out.print("jueves");
                break;
            case 5:
                System.out.print("viernes");
                break;
            case 6:
                System.out.print("sabado");
                break;
        }
    }
}
