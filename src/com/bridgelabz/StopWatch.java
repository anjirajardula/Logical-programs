package com.bridgelabz;

import java.util.Scanner;

/**
 * @author : Anjiraj
 * @version : 16.0
 * @since : 23/09/2021
 */

public class StopWatch {

    //  Ask User To Press A Key To Start The Time
    //Ask User To Press A Key To Stop The Time
    // Calculate The Elapsed Time

    public static void main(String[] args) {
        //Welcome Message Added
        System.out.println("Welcome To The Stop Watch Program");
        //Ask User To Press A Key To Start The Time
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key to start the time");
        char startch = sc.next().charAt(0);
        Long start = System.currentTimeMillis();
        //Ask User To Press A Key To Start The Time
        System.out.println("Enter a key to stop the time");
        char stopch = sc.next().charAt(0);
        Long stop = System.currentTimeMillis();
        //Condition To Calculate The Elapsed Time
        float timeElapsed = (float) (stop - start) / 1000;
        System.out.println("Time = " + timeElapsed + " Seconds");
    }
}
