package com;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class que3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double P,R,T;
        System.out.print("Enter the principal amount: ");
        P= s.nextDouble();
        System.out.print("Enter the rate of intrest: ");
        R= s.nextDouble();
        System.out.print("Enter the Time period: ");
        T= s.nextDouble();
        double simpleIntrest=(P*R*T)/100;
        System.out.println("Simple Intrest is :" +simpleIntrest);
    }
}
