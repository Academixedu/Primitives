package com.academix;

import java.util.Scanner;

/*
 * Class App will take inputs from user and print the sum
 */
public class App {
    /*
     * Class App will take inputs from user and print the sum
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = calculateSum(num1, num2);
        System.out.println("Sum: " + sum);

        scanner.close();
    }

    /*
     * Calculates the sum of two numbers
     */
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }
}