package com.bridgelabz;

import java.util.Scanner;

/**
 * @author : Anjiraj
 * @version : 16.0
 * @since : 23/09/2021
 */

public class ReverseNumber {

    //Ask User To Enter a Number
    //And Write Condition To Print Reverse Number

    public static void main(String[] args) {
        int num, reminder, reverse = 0;
        //Welcome message added
        System.out.println("The program to find Revrese of given Number");
        //Ask user to enter a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        //While condition for to print the reverse number
        while (num != 0) {

            reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num = num / 10;
        }
        System.out.println("The Reverse number is :" + reverse);
    }
}
