package org.example;
import java.text.DecimalFormat;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {
        DecimalFormat df = new DecimalFormat("###.##");
        Scanner input = new Scanner(System.in);
        System.out.println( "What is the order amount?" );
        double amount, tax;
        tax = 0.055;
        amount = input.nextDouble();
        input.nextLine();
        System.out.println("What is the state?");
        String state = input.nextLine();
        String total = String.format("$%.2f", amount);
        if( state.equals("WI") ){
            String taxs = ("$" + df.format((amount*tax)));
            amount = amount + (amount*tax);
            System.out.println("The subtotal is " + total + "." + "\nThe tax is " + taxs + ".");
            total = String.format("$%.2f", amount);
        }
        System.out.println("The total is " + total + ".");
    }
}
