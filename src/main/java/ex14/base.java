/*
 *  UCF COP3330 Summer 2021 Assignment 14 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 14 - Tax Calculator
 *  Write a simple program to compute the tax on an order amount. The program should prompt for the order amount and the state.
 *  If the state is “WI,” then the order must be charged 5.5% tax. The program should display the subtotal, tax, and total for
 *  Wisconsin residents but display just the total for non-residents.
 *
 *  Constraint:
 *  Implement this program using only a simple if statement—don’t use an else clause.
 *  Ensure that all money is rounded up to the nearest cent.
 *  Use a single output statement at the end of the program to display the program results.
 *
 */

package ex14;
import java.util.Scanner;

public class base {
    public static void main(String [] args)
    {
        // Variable initialization
        Scanner userInput = new Scanner(System.in);
        String state;
        double order, addedTax, total;
        double tax = 0.055;
        addedTax = 0;

        // User Input Step
        System.out.printf("What is the order amount? ");
        order = userInput.nextDouble();

        System.out.printf("What is the state? ");
        state = userInput.next();

        System.out.printf("The subtotal is $%.2f.%n", order);

        // If statement for Wisconsin
        if(state.equals("WI")) {
            addedTax = tax * order;
            System.out.printf("The tax is $%.2f.%n", addedTax);
        }

        // Total Calculation
        total = order + addedTax;
        System.out.printf("The total is $%.2f.", total);
    }
}
