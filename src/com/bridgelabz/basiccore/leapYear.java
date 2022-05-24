package com.bridgelabz.basiccore;

import java.util.Scanner;

public class leapYear {

    public static void main(String[] args) {

        System.out.println("Enter a year.....");
        Scanner scanner = new Scanner(System.in);
        long check = scanner.nextLong();

        if (check % 4 == 0 || check % 400 == 0) {
            System.out.println("The given year is a leap year....");
        } else {
            System.out.println("The given year is not a leap year....");
        }

    }
}
