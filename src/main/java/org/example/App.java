/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        double euro = input.nextDouble();
        System.out.print("What is the exchange rate? ");
        double rate = input.nextDouble();

        double dollar = Math.ceil(euro * rate * 100) / 100.0;
        System.out.printf("%.2f euros at an exchange rate of %.4f is\n%.2f U.S. dollars.", euro, rate, dollar);
    }
}
