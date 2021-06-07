package Base;

import java.util.Scanner;

/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Alek Dussuau


Exercise 14 - Tax Calculator
You don’t always need a complex control structure to solve simple problems. Sometimes a program requires an extra step
in one case, but in all other cases there’s nothing to do.

Write a simple program to compute the tax on an order amount. The program should prompt for the order amount and the
state. If the state is “WI,” then the order must be charged 5.5% tax. The program should display the subtotal, tax, and
total for Wisconsin residents but display just the total for non-residents.

Example Output
What is the order amount? 10
What is the state? WI
The subtotal is $10.00.
The tax is $0.55.
The total is $10.55.
Or

What is the order amount? 10
What is the state? MN
The total is $10.00

Constraints
Implement this program using only a simple if statement—don’t use an else clause.
Ensure that all money is rounded up to the nearest cent.
Use a single output statement at the end of the program to display the program results.

Challenges
Allow the user to enter a state abbreviation in upper, lower, or mixed case.
Also allow the user to enter the state’s full name in upper, lower, or mixed case.
 */
public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double tax;

        //inputs
        System.out.print("What is the order amount? ");
        String buff_order = input.nextLine();
        System.out.print("What is the state? ");
        String state = input.nextLine();

        //parsing
        double order = Double.parseDouble(buff_order);

        if(state.equalsIgnoreCase("wi")){
            //math
            tax = order * .055;
            double total = tax + order;

            //outputs
            System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f",
                            order,tax,total);
        }else{
            //outputs
            System.out.printf("The total is $%.2f",order);
        }
    }
}
