/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program asks for three numbers.
// Checks first to see that all numbers are different.
// If they’re not different, then exits.
// Otherwise, displays the largest number of the three.

package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // create variables to store the scanned numbers from the user
        // and a max variable to hold the largest value when comparing
        Double num1 = 0.0, num2 = 0.0, num3 = 0.0, max = 0.0;

        // prompt the user for the numbers in order
        // and store them accordingly
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        num3 = scanner.nextDouble();

        // compare the numbers
        // if they are similar exit, otherwise compare them to detect the
        // largest one and store it within max and output as described by
        // the assignment
        if ((num1 == num2) || (num1 == num3) || (num2 == num3)) {

            return;

        } else if (num1 > num2 && num1 >num3) {

            max = num1;
            System.out.print("The largest number is " + max + ".");

        } else if (num2 > num1 && num2 > num3) {

            max = num2;
            System.out.print("The largest number is " + max + ".");

        } else if (num3 > num1 && num3 > num2) {

            max = num3;
            System.out.print("The largest number is " + max + ".");

        }

    }

}