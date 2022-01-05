package com;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
//this code doesn't work for negative no.
public class que5 {
    public static void main(String[] args) {
        double num1,num2;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first no. : ");
        num1=s.nextDouble();
        System.out.print("Enter the second no. : ");
        num2=s.nextDouble();
        if (num1==num2){
            System.out.println("Both are equal");
            return;
        }
        if (num1>num2){
            System.out.println("the largest no. is: " + num1);
        }else if (num2>num1);{
            System.out.println("the largest no. is: " + num2);
        }

    }
}
