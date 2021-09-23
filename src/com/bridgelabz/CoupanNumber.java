package com.bridgelabz;

/**
 * @author :Anjiraj
 * @version : 16.0
 * @since : 23/09/2021
 */

public class CoupanNumber {

     //assigning the characters for coupon
     //giving the max. size of coupon


    public static void main(String[] args) {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max = 100000000;
        int random = (int) (Math.random() * max); //random function to generate coupon code
        StringBuffer sb = new StringBuffer();
        // while loop
        while (random > 0) {
            sb.append(chars[random % chars.length]);
            random /= chars.length;
        }

        String couponCode = sb.toString();
        System.out.println("Coupon Code: " + couponCode);
    }
}
