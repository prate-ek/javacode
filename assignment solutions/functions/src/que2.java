package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.");
        int num=s.nextint();
        evenodd(num);

    }
    public static int evenodd(int a){
        if(a%2==0)
            System.out.println("even");
        else
            System.out.println("odd");




    }

}