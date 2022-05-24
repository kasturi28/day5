package com.bridgelabz.basiccore;

import java.util.Scanner;

public class powerOfTwo {

    public static void main(String[] args) {

        System.out.println("Enter a power of 2.....");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double a = 2;
        double b = n;

        System.out.println("The output is " + (Math.pow(2 , n)));
    }

}
