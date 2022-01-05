package com;

import java.util.Scanner;

//Take name as input and print a greeting message for that name.
public class que2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Please enter your Name: ");
        String name=s.nextLine();
        System.out.println("Hello," + name);
    }
}
