package com.company;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class que6 {
    public static void main(String[] args) {
        double money,usd;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the amount : ");
        money=s.nextDouble();
        if (money<0){
            System.out.println("invalid input");
            return;
        }
        usd=money/75;
        System.out.println("money in USD is : "+usd+"$");


    }
}
