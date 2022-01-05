package com;

import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input.
public class que1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if (i == 0) {
            System.out.println("neither odd nor even");
            return;
        }
        if (i % 2 == 0) {
            System.out.println("No. entered is even");
        } else {
            System.out.println("No. entered is odd");
        }
    }
}