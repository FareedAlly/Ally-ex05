/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statements that ask for the first and second number and store them as strings
// Convert strings to int
// Perform calculations and print results

import java.util.Scanner;

public class Solution05
{
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("What is the first number? ");
        String first = in.nextLine();

        System.out.println("What is the second number? ");
        String second = in.nextLine();

        int number1 = Integer.parseInt(first);
        int number2 = Integer.parseInt(second);

        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;

        System.out.println(number1 + " + " + number2 + " = " + addition + "\n" + number1 + " - " + number2 + " = " + subtraction + "\n" + number1 + " * " + number2 + " = " + multiplication + "\n" + number1 + " / " + number2 + " = " + division + "\n" );
    }
}
